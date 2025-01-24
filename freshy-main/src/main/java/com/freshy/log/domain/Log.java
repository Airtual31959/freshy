package com.freshy.log.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/*
 *@BelongsPackage: com.freshy.log.domain
 *@CreatTime: 2025-01-24
 *@Description: TODO
 *@Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Log {
    /**
     * 日志ID
     */
    @TableId(value = "log_id")
    private String logId;

    /**
     * 日志等级
     */
    @TableField(value = "log_level")
    private String logLevel;

    /**
     * 日志行为
     */
    @TableField(value = "log_action")
    private String logAction;

    /**
     * 日志信息
     */
    @TableField(value = "log_data")
    private String logData;

    /**
     * 日志所属user_id（如果有）
     */
    @TableField(value = "user_id")
    private String userId;

    /**
     * 日志创建时间
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
