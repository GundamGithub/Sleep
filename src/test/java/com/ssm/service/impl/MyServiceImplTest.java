package com.ssm.service.impl;

import com.ssm.entity.menu;
import com.ssm.entity.sub;
import com.ssm.service.MyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml","classpath:spring-mybatis.xml"})
public class MyServiceImplTest {

    @Resource
    MyService myService;
    //一对多保存
    @Test
    public void insert() {
        menu menu = new menu();
        menu.setName("吉姆");

        List<sub> subs=new ArrayList<>();
        for (int i=1;i<=10;i++){
            sub sub = new sub();
            sub.setSub_name("量产型吉姆"+i+"号");
            subs.add(sub);
        }
        menu.setSubs(subs);         //menu拥有了name  subs
        int insert = myService.insert(menu);



    }
}