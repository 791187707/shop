package com.qf.service;

import com.github.pagehelper.PageInfo;
import com.qf.entity.Product;
import com.qf.vo.ProductVO;

import java.util.List;

/**
 * @Package: com.qf.service
 * @CreateDate: 2020/1/6 21:04
 * @Author: JiangXueZhi
 * @Description:    商品业务层接口
 */
public interface IProductService {

    /*查询商品*/
    List<Product> listProduct();

    /*分页查询所有商品*/
    PageInfo<Product> pageListProduct(Integer currentPage, Integer pageSize);

    /*添加商品  属性为vo类中的商品描述*/
    Long addProduct(ProductVO productVO);

    /*删除单个商品*/
    int deleteOneProduct(Long checkedOneID);
}
