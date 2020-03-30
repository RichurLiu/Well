package com.well.controller.news;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.well.controller.BasicController;
import com.well.entity.news.News;
import com.well.model.vo.NewsDetailVO;
import com.well.model.vo.NewsListVO;
import com.well.service.news.NewsService;
import com.well.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * RichurLiu
 * 2020/3/24 22:41
 */
@RestController
@RequestMapping("/well/news/")
public class NewsController extends BasicController {
    @Autowired
    private NewsService newsService;

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public NewsListVO newsList(HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin","*");
        Page<News> page = new Page<>();
        Wrapper<News> queryWrapper = new QueryWrapper<>();
        News news = new News();
        news.setStatus(1);
        ((QueryWrapper<News>) queryWrapper).setEntity(news);
        IPage<News> newsDTO = newsService.page(page, queryWrapper);
        NewsListVO newsListVO = new NewsListVO();
        newsListVO.setStatus(0);
        List<News> newsList = newsDTO.getRecords();
        List<NewsDetailVO> newsVOList = new ArrayList<>();
        if(!CollectionUtils.isEmpty(newsList)){
            newsList.forEach(item -> newsVOList.add(convert(item)));
        }
        newsListVO.setNewsList(newsVOList);
        return newsListVO;
    }

    @RequestMapping(value = "detail/{id}", method = RequestMethod.GET)
    public NewsDetailVO newsDetail(HttpServletResponse response, @PathVariable("id")Long id){
        response.setHeader("Access-Control-Allow-Origin","*");
        News news = newsService.getById(id);
        NewsDetailVO newsDetailVO = convert(news);
        newsDetailVO.setStatus(0);
        return newsDetailVO;
    }

    private NewsDetailVO convert(News news){
        NewsDetailVO vo = new NewsDetailVO();
        vo.setAddTime(DateUtil.getTimestampOfDateTime(news.getCtime()));
        vo.setTitle(news.getTitle());
        vo.setClick(news.getClick());
        vo.setContent(news.getContent());
        vo.setId(news.getId());
        vo.setImgUrl(news.getImgUrl());
        return vo;
    }
}
