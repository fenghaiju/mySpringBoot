package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.example.demo
 * 94936
 * 2018/1/5
 * 13:33
 * mySpringBoot
 **/
@RestController  //等同于同时加上了@Controller和@ResponseBody
public class HelloController {


    //访问/hello或者/hi任何一个地址，都会返回一样的结果
    @RequestMapping(value = {"/hello","/hi"},method = RequestMethod.GET)
    public String say(){
        return "my first spring boot!!!";
    }
}
