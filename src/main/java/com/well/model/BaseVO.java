package com.well.model;

import lombok.Getter;
import lombok.Setter;

/**
 * RichurLiu
 * 2020/3/24 23:01
 */
@Setter
@Getter
public class BaseVO {
    private Integer code;
    private String msg;
    private Integer status;

    public static BaseVO success(){
        BaseVO vo = new BaseVO();
        vo.setStatus(0);
        vo.setMsg("success");
        return vo;
    }

    public static BaseVO failed(){
        BaseVO vo = new BaseVO();
        vo.setStatus(1);
        vo.setMsg("failed");
        return vo;
    }

    public static BaseVO failed(String msg){
        BaseVO vo = new BaseVO();
        vo.setStatus(1);
        vo.setMsg(msg);
        return vo;
    }
}
