package com.qf.shop.manager.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wurim on 2018/8/28.
 */

@Controller
public class ManagerIndexAction {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
