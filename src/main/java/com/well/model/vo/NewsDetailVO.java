package com.well.model.vo;

import com.well.model.BaseVO;
import lombok.Getter;
import lombok.Setter;

/**
 * RichurLiu
 * 2020/3/24 22:59
 */
@Getter
@Setter
public class NewsDetailVO extends BaseVO {
    private Long id;
    private String title;
    private Long addTime;
    private Integer click;
    private String content;
    private String imgUrl;


}
