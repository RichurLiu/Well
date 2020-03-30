package com.well.model.vo.news;

import com.well.model.BaseVO;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * @author richur
 */
@Setter
@Getter
public class CommentVO extends BaseVO {
    private Long id;

    /**
     * 新闻ID
     */
    private Long newsId;

    /**
     * 用户
     */
    private Integer userId;

    /**
     * 用户
     */
    private String userName;

    /**
     * 评论正文
     */
    private String content;

    /**
     * 创建时间
     */
    private Long addTime;
}
