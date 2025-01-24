package com.freshy.file.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/*
 *@BelongsPackage: com.freshy.file.domain
 *@CreatTime: 2025-01-24
 *@Description: TODO
 *@Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class File {
    /**
     * 文件ID
     */
    @TableId(value = "file_id")
    private String fileId;

    /**
     * 文件名称
     */
    @TableField(value = "file_name")
    private String fileName;

    /**
     * 文件类型
     */
    @TableField(value = "file_type")
    private String fileType;

    /**
     * 文件内容
     */
    @TableField(value = "file_data")
    private String fileData;

    /**
     * 文件所属user_id
     */
    @TableField(value = "user_id")
    private String userId;

    /**
     * 文件创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 最后更新时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

    /**
     * 删除标识
     */
    @TableField(value = "is_deleted")
    private Integer isDeleted;

}
