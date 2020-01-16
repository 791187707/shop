package com.qf.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Package: com.qf.entity
 * @CreateDate: 2020/1/6 11:58
 * @Author: JiangXueZhi
 * @Description:    商品类别实体类
 */
@Data
@Accessors(chain = true)
@TableName("t_product_type")
public class ProductType implements Serializable {

    private Long id;

    private Long pid;

    private String name;

}
