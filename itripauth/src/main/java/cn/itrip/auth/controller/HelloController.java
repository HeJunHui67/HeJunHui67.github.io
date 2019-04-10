package cn.itrip.auth.controller;

import jdk.nashorn.internal.ir.ReturnNode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HelloController {
    @RequestMapping(value="/hello")
    public  String  hello(){
        return  "index";
    }

}
