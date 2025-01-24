package com.freshy.user.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.freshy.user.domain.Teacher;
import com.freshy.user.iService.ITeacherService;
import com.freshy.user.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 *@BelongsPackage: com.freshy.user.serviceImpl
 *@CreatTime: 2025-01-24
 *@Description: TODO
 *@Version: 1.0
 */
@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements ITeacherService {
    @Autowired
    private TeacherMapper teacherMapper;
}
