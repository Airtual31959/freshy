package com.freshy.user.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/*
 *@BelongsPackage: com.freshy.user.domain
 *@CreatTime: 2025-01-24
 *@Description: TODO
 *@Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    /**
     * 用户ID
     */
    @TableId(value = "user_id")
    private String userId;

    /**
     * 用户姓名
     */
    @TableField(value = "user_name")
    private String userName;

    /**
     * 用户性别
     */
    @TableField(value = "gender")
    private String gender;

    /**
     * 用户出生日期
     */
    @TableField(value = "birth_date")
    private Date birthDate;

    /**
     * 用户角色
     */
    @TableField(value = "role_id")
    private Long roleId;

    /**
     * 用户身份证号
     */
    @TableField(value = "id_number")
    private String idNumber;

    /**
     * 用户手机号
     */
    @TableField(value = "phone_number")
    private String phoneNumber;

    /**
     * 用户住址
     */
    @TableField(value = "address")
    private String address;

    /**
     * 用户创建时间
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
