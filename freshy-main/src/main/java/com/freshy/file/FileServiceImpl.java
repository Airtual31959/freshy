package com.freshy.file;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.freshy.file.domain.File;
import com.freshy.file.mapper.FileMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 *@BelongsPackage: com.freshy.file
 *@CreatTime: 2025-01-24
 *@Description: TODO
 *@Version: 1.0
 */
@Service
public class FileServiceImpl extends ServiceImpl<FileMapper, File> implements IFileService {
    @Autowired
    private FileMapper fileMapper;
}
