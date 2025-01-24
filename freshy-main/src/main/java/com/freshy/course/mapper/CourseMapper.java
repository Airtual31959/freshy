package com.freshy.course.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.freshy.course.domain.Course;
import org.apache.ibatis.annotations.Mapper;

/*
 *@BelongsPackage: com.freshy.course.mapper
 *@CreatTime: 2025-01-24
 *@Description: TODO
 *@Version: 1.0
 */
@Mapper
public interface CourseMapper extends BaseMapper<Course> {
}
