package com.jk.controller;

import com.jk.entity.SysUser;
import com.jk.entity.Tree;
import com.jk.service.HuiYuanService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("shiro")
public class ShiroController {
    @Resource
    private HuiYuanService huiYuanService;


    @RequestMapping("toLogin")
    public String toLogin() {
        return "login";
    }
    @RequestMapping("toMain")
    public String toMain() {
        return "main";
    }
    @RequestMapping("login")
    @ResponseBody
    public String login(SysUser user) {
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken upt = new UsernamePasswordToken(user.getUsercode(), user.getPassword());
        try {
            // 不抛异常代表登录成功
            subject.login(upt);
            return "登录成功";
        } catch (UnknownAccountException uae) {
            return "账号不存在";
        } catch (IncorrectCredentialsException ice) {
            return "密码错误";
        } catch (AuthenticationException e) {
            return "登录失败，网络错误";
        }
    }

    @RequestMapping("/queryTree")
    @ResponseBody
    public List<Tree> queryTree() {
        System.out.println("登录成功");
        //查询当前用户所属的权限树
        SysUser user = (SysUser)SecurityUtils.getSubject().getPrincipal();
        return huiYuanService.selectTreeList(user.getId());
    }
}
