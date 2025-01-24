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
public class Teacher extends User{
    /** 教师ID */
    @TableField(value = "teacher_id")
    private String teacherId;

    /** 教师密码 */
    @TableField(value = "teacher_password")
    private String teacherPassword;

    /** 教师邮箱 */
    @TableField(value = "email")
    private String email;

    /** 雇用日期 */
    @TableField(value = "hire_date")
    private Date hireDate;
}
