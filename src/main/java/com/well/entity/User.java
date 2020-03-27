package com.well.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author RichurLiu
 * @since 2020-03-26
 */
@TableName("tb_user")
public class User extends Model<User> {

    private static final long serialVersionUID=1L;
    /**
     *  自增ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 有效状态
     */
    private Integer status;
    /**
     * 创建时间
     */
    private LocalDateTime ctime;
    /**
     * 修改时间
     */
    private LocalDateTime mtime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public LocalDateTime getCtime() {
        return ctime;
    }

    public void setCtime(LocalDateTime ctime) {
        this.ctime = ctime;
    }

    public LocalDateTime getMtime() {
        return mtime;
    }

    public void setMtime(LocalDateTime mtime) {
        this.mtime = mtime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "User{" +
        "id=" + id +
        ", userName=" + userName +
        ", nickname=" + nickname +
        ", age=" + age +
        ", phone=" + phone +
        ", email=" + email +
        ", status=" + status +
        ", ctime=" + ctime +
        ", mtime=" + mtime +
        "}";
    }
}
