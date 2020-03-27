package com.well.service.impl;

import com.well.entity.Comment;
import com.well.mapper.CommentMapper;
import com.well.service.CommentService;
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
