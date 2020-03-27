package com.well.model.vo;


import com.well.model.BaseVO;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * RichurLiu
 * 2020/3/24 22:51
 */
@Setter
@Getter
public class NewsListVO extends BaseVO {
    List<NewsDetailVO> newsList;
}
