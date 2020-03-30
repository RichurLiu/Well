package com.well.service.impl.news;

import com.well.entity.news.Comment;
import com.well.mapper.news.CommentMapper;
import com.well.service.news.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author RichurLiu
 * @since 2020-03-26
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
