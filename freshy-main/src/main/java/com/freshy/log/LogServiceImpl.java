package com.freshy.log;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.freshy.log.domain.Log;
import com.freshy.log.mapper.LogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 *@BelongsPackage: com.freshy.log
 *@CreatTime: 2025-01-24
 *@Description: TODO
 *@Version: 1.0
 */
@Service
public class LogServiceImpl extends ServiceImpl<LogMapper, Log> implements ILogService {
    @Autowired
    private LogMapper logMapper;
}
