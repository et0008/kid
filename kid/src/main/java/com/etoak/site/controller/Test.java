package com.etoak.site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yinyong on 2017/3/2.
 */
@Controller
public class Test {
    @RequestMapping(value="/index")
    public String index(){
        return "index";
    }
}
