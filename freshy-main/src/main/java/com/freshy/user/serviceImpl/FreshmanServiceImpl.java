package com.freshy.user.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.freshy.user.domain.Freshman;
import com.freshy.user.iService.IFreshmanService;
import com.freshy.user.mapper.FreshmanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 *@BelongsPackage: com.freshy.user.serviceImpl
 *@CreatTime: 2025-01-24
 *@Description: TODO
 *@Version: 1.0
 */
@Service
public class FreshmanServiceImpl extends ServiceImpl<FreshmanMapper, Freshman> implements IFreshmanService {
    @Autowired
    private FreshmanMapper freshmanMapper;
}
