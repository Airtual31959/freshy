package com.freshy.dormitory;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.freshy.dormitory.domain.Dormitory;
import com.freshy.dormitory.mapper.DormitoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 *@BelongsPackage: com.freshy.dormitory
 *@CreatTime: 2025-01-24
 *@Description: TODO
 *@Version: 1.0
 */
@Service
public class DormitoryServiceImpl extends ServiceImpl<DormitoryMapper, Dormitory> implements IDormitoryService {
    @Autowired
    private DormitoryMapper dormitoryMapper;
}
