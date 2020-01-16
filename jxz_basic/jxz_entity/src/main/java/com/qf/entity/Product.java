package com.qf.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @Package: com.qf.entity
 * @CreateDate: 2020/1/6 18:51
 * @Author: JiangXueZhi
 * @Description:    商品实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@TableName("t_product")
public class Product implements Serializable {
    private Long id;

    private String name;

    private Long price;

    private Long saleprice;

    private String salepoint;

    private String image;

    private Long stock;

    private Integer typeid;

    private String typename;

    private Boolean flag;

    private Date creattime;

    private Date updatetime;

    private Long creatuser;

    private Long updateuser;

    private static final long serialVersionUID = 1L;
}