package com.freshy.user.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/*
 *@BelongsPackage: com.freshy.user.domain
 *@CreatTime: 2025-01-24
 *@Description: TODO
 *@Version: 1.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "admin")
public class Admin extends User {
    /** 管理员ID */
    @TableField(value = "admin_id")
    private String adminId;

    /** 管理员密码 */
    @TableField(value = "admin_password")
    private String adminPassword;
}
