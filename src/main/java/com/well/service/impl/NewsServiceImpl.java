package com.well.service.impl;

import com.well.entity.News;
import com.well.mapper.NewsMapper;
import com.well.service.NewsService;
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
