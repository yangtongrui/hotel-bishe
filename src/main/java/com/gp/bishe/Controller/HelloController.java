package com.gp.bishe.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
//无参数使用request；有参数使用post
    @RequestMapping("/hello")
    @ResponseBody
    public  String helloTest(){
        return "hello";
    }
}
