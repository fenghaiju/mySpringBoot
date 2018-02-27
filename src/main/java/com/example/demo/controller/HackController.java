package com.example.demo.controller;

import com.example.demo.dao.ConfRep;
import com.example.demo.dao.HackerRep;
import com.example.demo.model.Conf;
import com.example.demo.model.Hack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * com.example.demo.controller
 * 94936
 * 2018/1/5
 * 14:23
 * mySpringBoot
 **/
@RestController
public class HackController {
    @Autowired
    private HackerRep hackerRep;
    @Autowired
    private ConfRep confRep;
    /**
     * 查询所有列表
     * @return
     */
    @RequestMapping(value = "/hacker",method = RequestMethod.GET)
    public List<Hack> getGirlList(String type){

        return hackerRep.getAccessLimitList(type);
    }
    /**
     * 添加一个女生
     * @return
     */
    @RequestMapping(value = "/conf",method = RequestMethod.POST)
    public Conf addConf( Conf conf){
       // Conf conf = new Conf();
        System.out.println("dddddddddddddddddddddddddd=============="+conf);
        return confRep.save(conf);
    }
    /**
     * 添加一个女生
     * @return
     */
    @RequestMapping(value = "/confList",method =RequestMethod.GET)
    public List<Conf> confList(Conf conf, HttpServletRequest request){
        Cookie[] cookies = request.getCookies();//这样便可以获取一个cookie数组
        for(Cookie cookie : cookies){
            System.out.println("==========================================");
            System.out.println("=========================================="+cookie.getName());
            System.out.println("=========================================="+ cookie.getValue());
            cookie.getName();// get the cookie name
            cookie.getValue(); // get the cookie value
        }
        return confRep.findAll();
    }
}
