package com.qf.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Package: com.qf.entity
 * @CreateDate: 2020/1/14 10:58
 * @Author: JiangXueZhi
 * @Description:    异步请求结果返回类
 */
@Data
public class ResultBean implements Serializable {
    //状态码 200  500
    private Integer statuCode;
    //操作成功-返回的消息
    private String successMsg;
    //操作失败-返回的消息
    private String failMsg;

    //成功的方法
    public static ResultBean success(String successMsg){
        ResultBean resultBean = new ResultBean();
        resultBean.setStatuCode(200);
        resultBean.setSuccessMsg(successMsg);
        return resultBean;
    }

    //失败的方法
    public static ResultBean fail(String failMsg){
        ResultBean resultBean = new ResultBean();
        resultBean.setStatuCode(500);
        resultBean.setFailMsg(failMsg);
        return resultBean;
    }


}
