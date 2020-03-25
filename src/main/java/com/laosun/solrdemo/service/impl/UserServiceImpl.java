/**
 * Copyright (C), 2009-2020
 * FileName: UserServiceImpl
 * Author:   laosun
 * Date:     2020/3/25 1:42 下午
 * Description:
 */
package com.laosun.solrdemo.service.impl;

import com.laosun.solrdemo.pojo.User;
import com.laosun.solrdemo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<User> addUser() {
        List<User> list = new ArrayList<>();

        for (int i = 0; i <5 ; i++) {

            User user = new User();

            user.setId(UUID.randomUUID().toString().replace("-",""));
            user.setName("jack"+i);
            if( i % 2 ==0) {
                user.setSex("男");
            }else {
                user.setSex("女");
            }
            user.setAddress("北京故宫666"+i);
            user.setHost(73040+i);
            list.add(user);
        }
        return list;
    }
}
