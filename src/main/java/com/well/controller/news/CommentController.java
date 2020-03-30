package com.well.controller.news;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.well.entity.news.Comment;
import com.well.entity.news.News;
import com.well.model.BaseVO;
import com.well.model.vo.NewsDetailVO;
import com.well.model.vo.news.CommentListVO;
import com.well.model.vo.news.CommentVO;
import com.well.service.news.CommentService;
import com.well.util.DateUtil;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * RichurLiu
 * 2020/3/25 0:03
 */
@Slf4j
@RestController
@RequestMapping("/well/comment/")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @RequestMapping(value = "list/{id}", method = RequestMethod.GET)
    public CommentListVO commentList(HttpServletResponse response, @PathVariable("id")Long newsId, @RequestParam(value = "pageIndex") Integer current){
        response.setHeader("Access-Control-Allow-Origin","*");
        Page<Comment> page = new Page<>();
        page.setCurrent(current);
        page.setSize(2);
        Wrapper<Comment> queryWrapper = new QueryWrapper<>();
        Comment comment = new Comment();
        comment.setStatus(1);
        comment.setNewsId(newsId);
        ((QueryWrapper<Comment>) queryWrapper).setEntity(comment);
        IPage<Comment> commentIPage = commentService.page(page, queryWrapper);
        List<Comment> records = commentIPage.getRecords();
        CommentListVO commentListVO = new CommentListVO();
        commentListVO.setStatus(0);
        List<CommentVO> commentVOList = new ArrayList<>();
        if(!CollectionUtils.isEmpty(records)){
            records.forEach(item -> commentVOList.add(convert(item)));
        }
        commentListVO.setCommentList(commentVOList);
        return commentListVO;
    }

    @RequestMapping(value = "add", method = RequestMethod.POST, consumes="application/json")
    public BaseVO addComment(HttpServletResponse response, HttpServletRequest request, @RequestBody CommentVO commentVO){

        log.info("request:{}", JSON.toJSONString(commentVO));
        response.setHeader("Access-Control-Allow-Origin","*");

        Comment comment = convert(commentVO);
        boolean save = commentService.save(comment);
        if(save){
            return BaseVO.success();
        } else {
            return BaseVO.failed();
        }
    }


    @RequestMapping(value = "add1", method = RequestMethod.POST)
    public BaseVO addComment1(HttpServletResponse response, HttpServletRequest request,@RequestParam Long newsId,@RequestParam String content ){

//        log.info("request:{}", JSON.toJSONString(request));
        response.setHeader("Access-Control-Allow-Origin","*");

//        Comment comment = convert(commentVO);
        Comment comment = new Comment();
        comment.setNewsId(newsId);
        comment.setContent(content);
        comment.setUserId(-1);
        boolean save = commentService.save(comment);
        if(save){
            return BaseVO.success();
        } else {
            return BaseVO.failed();
        }
    }

    private CommentVO convert(Comment comment){
        CommentVO vo = new CommentVO();
        vo.setAddTime(DateUtil.getTimestampOfDateTime(comment.getCtime()));
        vo.setContent(comment.getContent());
        vo.setId(comment.getId());
        vo.setNewsId(comment.getNewsId());
        vo.setUserId(comment.getUserId());
        vo.setUserName("用户"+comment.getUserId());
        if(comment.getUserId() == -1){
            vo.setUserName("游客");
        }
        return vo;
    }

    private Comment convert(CommentVO comment){
        Comment vo = new Comment();
        DateUtil.getDateTimeOfTimestamp(comment.getAddTime());
//        vo.setCtime(DateUtil.getDateTimeOfTimestamp(comment.getAddTime()));
        vo.setContent(comment.getContent());
        vo.setNewsId(comment.getNewsId());
        if(null == comment.getUserId()){
            vo.setUserId(-1);
        } else {
            vo.setUserId(comment.getUserId());
        }
        return vo;
    }
}
