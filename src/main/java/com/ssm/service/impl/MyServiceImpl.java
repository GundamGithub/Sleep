package com.ssm.service.impl;

import com.ssm.entity.menu;
import com.ssm.entity.sub;
import com.ssm.mapper.menuMapper;
import com.ssm.mapper.subMapper;
import com.ssm.service.MyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MyServiceImpl implements MyService {
        @Resource
    menuMapper menuMapper;
        @Resource
    subMapper subMapper;


        public int insert(menu menu){
            int row = menuMapper.insrtMenu(menu);
            Integer keyId = menu.getMenu_id();
            List<sub> subs = menu.getSubs();
            for (sub sub:subs){
                sub.setSub_id(keyId);
                subMapper.insertSub(sub);
            }
            return keyId;

        }

    @Override
    public List<menu> finAll() {
        List<menu> all = menuMapper.findAll();
        return all;
    }


}
