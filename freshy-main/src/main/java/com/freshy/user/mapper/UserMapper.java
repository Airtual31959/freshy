package com.freshy.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.freshy.user.domain.User;
import org.apache.ibatis.annotations.Mapper;

/*
 *@BelongsPackage: com.freshy.user.mapper
 *@CreatTime: 2025-01-24
 *@Description: TODO
 *@Version: 1.0
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
