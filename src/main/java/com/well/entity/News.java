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
@TableName("tb_news")
public class News extends Model<News> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户
     */
    private Integer userId;

    /**
     * 标题
     */
    private String title;

    /**
     * 点击数
     */
    private Integer click;

    /**
     * 正文
     */
    private String content;

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


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getClick() {
        return click;
    }

    public void setClick(Integer click) {
        this.click = click;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
        return "News{" +
        "id=" + id +
        ", userId=" + userId +
        ", title=" + title +
        ", click=" + click +
        ", content=" + content +
        ", status=" + status +
        ", ctime=" + ctime +
        ", mtime=" + mtime +
        "}";
    }
}
