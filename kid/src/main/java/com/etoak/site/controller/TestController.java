package com.etoak.site.controller;

import com.etoak.site.bean.Kid;
import com.etoak.site.service.Testservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yinyong on 2017/3/6.
 */
@Controller
public class TestController {
    @Autowired
    private Testservice testservice;

    @RequestMapping(value = "/index")
    public String index(){
        Kid kid = new Kid();
        kid.setAge("20");
        kid.setId("1");
        kid.setName("kid");
        String aa = testservice.addTest(kid);
        System.out.println(aa);
        return "index";
    }
}
