package com.ssm.controller;

import com.ssm.entity.menu;
import com.ssm.service.MyService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class MyController {
    @Resource
    MyService myService;


    //一对多查询
    @RequestMapping("findAll")
    public menu findALl() {
        List<menu> menus = myService.finAll();
        for (menu menu : menus) {
            return menu;
        }


    }
}