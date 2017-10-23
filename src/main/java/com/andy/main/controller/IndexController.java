package com.andy.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 主界面控制器
 */
@Controller
public class IndexController {

    /**
     * 直接跳转到主页导航界面
     * @return
     */
    @RequestMapping(value = "/")
    public String index(){
        return "page/index.html";
    }

}
