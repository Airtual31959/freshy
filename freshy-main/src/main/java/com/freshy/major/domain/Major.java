package com.freshy.major.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/*
 *@BelongsPackage: com.freshy.major.domain
 *@CreatTime: 2025-01-24
 *@Description: TODO
 *@Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Major {
    /**
     * 专业ID
     */
    @TableId(value = "major_id")
    private String majorId;

    /**
     * 专业名称
     */
    @TableField(value = "major_name")
    private String majorName;

    /**
     * 专业信息
     */
    @TableField(value = "major_description")
    private String majorDescription;

    /**
     * 专业创建时间
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
