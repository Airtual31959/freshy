package com.freshy.user.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.freshy.user.domain.Admin;
import com.freshy.user.iService.IAdminService;
import com.freshy.user.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 *@BelongsPackage: com.freshy.user.serviceImpl
 *@CreatTime: 2025-01-24
 *@Description: TODO
 *@Version: 1.0
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper,Admin> implements IAdminService {
    @Autowired
    private AdminMapper adminMapper;
}
