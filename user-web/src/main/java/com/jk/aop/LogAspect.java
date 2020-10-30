package com.jk.aop;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPObject;
import com.jk.entity.LogBean;
import com.jk.service.LogSenderService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Aspect
@Component
public class LogAspect {
    @Resource
    private LogSenderService logSenderService;
    @Pointcut(value = "execution(* com.jk.controller.*.*(..))")
    public void logCut(){

    }
    @AfterReturning(pointcut = "logCut()",returning = "obj")
    public void saveLog(JoinPoint joinPoint,Object obj){
        String className=joinPoint.getTarget().getClass().getSimpleName();
        String methodName=joinPoint.getSignature().getName();
        Object[] args=joinPoint.getArgs();
        StringBuffer sb=new StringBuffer();
        for (int i = 1; i < args.length; i++) {
            sb.append("第"+i+"个参数"+args[i]);
        }
        String responseParams = obj == null ? "" : obj.toString();
        LogBean log=new LogBean();
        log.setClassName(className);
        log.setMethodName(methodName);
        log.setRequestParams(sb.toString());
        log.setResponseParams(responseParams);
        String logJson=JSONObject.toJSONString(log);
        logSenderService.send(logJson);
    }
}
