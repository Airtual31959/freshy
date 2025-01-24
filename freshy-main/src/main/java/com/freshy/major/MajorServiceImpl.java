package com.freshy.major;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.freshy.major.domain.Major;
import com.freshy.major.mapper.MajorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 *@BelongsPackage: com.freshy.major
 *@CreatTime: 2025-01-24
 *@Description: TODO
 *@Version: 1.0
 */
@Service
public class MajorServiceImpl extends ServiceImpl<MajorMapper, Major> implements IMajorService {
    @Autowired
    private MajorMapper majorMapper;
}
