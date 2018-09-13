package com.boot.app.service.impl;

import com.boot.app.entity.TempInfo;
import com.boot.app.mapper.TempInfoMapper;
import com.boot.app.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017-08-31.
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Resource
    private TempInfoMapper tempInfoMapper;

    public void showInfo() {
        TempInfo info = tempInfoMapper.getInfo();
        logger.info("----result:{}", info.toString());
    }
}
