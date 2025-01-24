package com.freshy.user.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.freshy.user.domain.User;
import com.freshy.user.iService.IUserService;
import com.freshy.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 *@BelongsPackage: com.freshy.user
 *@CreatTime: 2025-01-24
 *@Description: TODO
 *@Version: 1.0
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Autowired
    private UserMapper userMapper;
}
