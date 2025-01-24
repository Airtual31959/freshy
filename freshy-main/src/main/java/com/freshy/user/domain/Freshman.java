package com.freshy.user.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

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
public class Freshman extends User{
    /** 新生ID */
    @TableField(value = "freshman_id")
    private String freshmanId;

    /** 新生学号 */
    @TableField(value = "freshman_number")
    private String freshmanNumber;

    /** 新生密码 */
    @TableField(value = "freshman_password")
    private String freshmanPassword;

    /** 入学时间 */
    @TableField(value = "enrollment_date")
    private Date enrollmentDate;
}
