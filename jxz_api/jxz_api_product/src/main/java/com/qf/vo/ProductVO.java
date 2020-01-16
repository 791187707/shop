package com.qf.vo;

import com.qf.entity.Product;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Package: com.qf
 * @CreateDate: 2020/1/7 19:42
 * @Author: JiangXueZhi
 * @Description:    当表单提交时 有某些东西不属于数据库表的字段 进行接收数据时  只需在方法的参数中定义一个vo对象 以此来接收外来数据
 */
@Data
@Accessors(chain = true)
public class ProductVO implements Serializable {
    private Product product;
    private String productDesc; //添加商品的表单中   productDesc不在t_product的数据库表中
}
