package com.well;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.well.entity.news.News;
import com.well.service.news.NewsService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author richur
 */
public class NewsTest extends WellApplicationTests {

    @Autowired
    private NewsService newsService;
    @Test
    public void test01(){
        Page<News> page = new Page<>();
        News news = new News();
        news.setStatus(1);
        Wrapper<News> queryWrapper = new QueryWrapper<>();
        ((QueryWrapper<News>) queryWrapper).setEntity(news);
        IPage<News> newsList = newsService.page(page, queryWrapper);
        System.out.println(JSON.toJSON(newsList));
    }
}
