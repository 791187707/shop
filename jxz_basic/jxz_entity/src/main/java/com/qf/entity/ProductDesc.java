package com.qf.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Package: com.qf.entity
 * @CreateDate: 2020/1/6 11:57
 * @Author: JiangXueZhi
 * @Description:    商品描述实体类
 */
@Data
@Accessors(chain = true)
@TableName("t_product_desc")
public class ProductDesc implements Serializable {

    private Long id;

    private Long productId;

    private String productDesc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }
}
