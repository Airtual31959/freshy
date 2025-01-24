package com.freshy.dormitory.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/*
 *@BelongsPackage: com.freshy.dormitory.domain
 *@CreatTime: 2025-01-24
 *@Description: TODO
 *@Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dormitory {
    /**
     * 宿舍ID
     */
    @TableId(value = "dormitory_id")
    private String dormitoryId;

    /**
     * 宿舍号
     */
    @TableField(value = "dormitory_number")
    private String dormitoryNumber;

    /**
     * 宿舍楼名称
     */
    @TableField(value = "dormitory_building")
    private String dormitoryBuilding;

    /**
     * 校区ID
     */
    @TableField(value = "campus_id")
    private String campusId;

    /**
     * 宿舍创建时间
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
