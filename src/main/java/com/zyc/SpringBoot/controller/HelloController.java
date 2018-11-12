package com.zyc.SpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author:ZYX
 * @Description:
 * @Date: Create in  2018/11/12 13:51
 * @Modified By:
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    @ResponseBody
    public String index() {
        //System.out.println(2);
        return "Hello World ";
    }
}
