package com.well.entity.news;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Getter;
import lombok.Setter;

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
@Setter
@Getter
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
     * 图片
     */
    private String imgUrl;

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
        ", imgUrl=" + imgUrl +
        ", status=" + status +
        ", ctime=" + ctime +
        ", mtime=" + mtime +
        "}";
    }
}
