package com.jbit.service;

import com.jbit.entity.DevUser;
import com.jbit.mapper.DevUserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class DevUserService {
    @Resource
    private DevUserMapper devUserMapper;

    public DevUser queryLogin(String devcodel, String devpassword){
        DevUser devUser = new DevUser();
        devUser.setDevcode(devcodel);
        devUser.setDevpassword(devpassword);
       return devUserMapper.selectOne(devUser);

    }
}
