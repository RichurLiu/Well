package com.well.service.impl.news;

import com.well.entity.news.News;
import com.well.mapper.news.NewsMapper;
import com.well.service.news.NewsService;
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
public class NewsServiceImpl extends ServiceImpl<NewsMapper, News> implements NewsService {

}
