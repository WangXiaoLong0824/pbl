package com.jk.service;

import com.jk.entity.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "user-provider")
public interface HuiYuanService {
    /**
     * wxl
     * @param currPage
     * @param pageSize
     * @param user
     * @return
     */
    @RequestMapping("findHuiYuanLevel")
    public PageResult findHuiYuanLevel(@RequestParam(value = "currPage", defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize", defaultValue = "2") Integer pageSize, @RequestBody User user);
    @RequestMapping("deleteHuiYuan")
    public void deleteHuiYuan(@RequestParam Integer userId);
    @RequestMapping("addHuiYuan")
    public void addHuiYuan(@RequestBody User user);
    @RequestMapping("findHuiYuanLevelById")
    public User findHuiYuanLevelById(@RequestBody Integer userId);
    @RequestMapping("updateHuiYuanLevel")
    public void updateHuiYuanLevel(@RequestBody User user);

    /**
     * ww
     * @return
     */
    @RequestMapping("findIdea")
    public List<Idea> findIdea();

    @RequestMapping("addIdea")
    public String addIdea(@RequestBody Idea idea);

    @RequestMapping("deleteById")
    public String deleteById(@RequestParam Integer ideaId);

    @RequestMapping("findIdeaById")
    public Idea findIdeaById(@RequestParam Integer ideaId);

    @RequestMapping("findIdeaPage")
    public PageResult findIdeaPage(@RequestParam(value="currPage",defaultValue="1") Integer currPage, @RequestParam(value="pageSize",defaultValue="10") Integer pageSize, @RequestBody Idea idea);

    @RequestMapping("findMessagePage")
    public PageResult findMessagePage(@RequestParam(value="currPage",defaultValue="1") Integer currPage, @RequestParam(value="pageSize",defaultValue="10") Integer pageSize, @RequestBody Idea idea);

    @RequestMapping("addMessage")
    public String addMessage(@RequestBody Idea idea);

    @RequestMapping("deleteMesById")
    public String deleteMesById(@RequestParam Integer ideaId);

    @RequestMapping("findMesById")
    public Idea findMesById(@RequestParam Integer ideaId);




    @RequestMapping("findArticlePage")
    public PageResult findArticlePage(@RequestParam(value= "currPage",defaultValue= "1") Integer currPage, @RequestParam(value= "pageSize",defaultValue= "10") Integer pageSize,@RequestBody Article article);

    @RequestMapping("addArticle")
    public String addArticle(@RequestBody Article article);

    @RequestMapping("deleteArticleById")
    public String deleteArticleById(@RequestParam Integer articleId);

    @RequestMapping("findArticleById")
    public Article findArticleById(@RequestParam Integer articleId);

    @RequestMapping("findImgPage")
    public PageResult findImgPage(@RequestParam(value="currPage",defaultValue="1") Integer currPage, @RequestParam(value="pageSize",defaultValue="10") Integer pageSize, @RequestBody Img img);

    @RequestMapping("addImg")
    public void addImg(@RequestBody Img img);

    @RequestMapping("deleteImgById")
    public void deleteImgById(@RequestParam Integer imgId);

    @RequestMapping("findImgById")
    public Img findImgById(@RequestParam Integer imgId);




    @RequestMapping("findProduct")
    public PageResult findProduct(@RequestParam(value = "currPage", defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize", defaultValue = "2") Integer pageSize, @RequestBody Product product);
    @RequestMapping("deleteProduct")
    public void deleteProduct(@RequestParam Integer productId);
    @RequestMapping("addProduct")
    public void addProduct(@RequestBody Product product);
    @RequestMapping("findProductById")
    public Product findProductById(@RequestParam Integer productId);
    @RequestMapping("updateProduct")
    public void updateProduct(@RequestBody Product product);
}
