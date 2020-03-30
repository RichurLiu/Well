package com.well.model.vo.news;

import com.well.entity.news.Comment;
import com.well.model.BaseVO;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author richur
 */
@Setter
@Getter
public class CommentListVO extends BaseVO {
    List<CommentVO> commentList;
}
