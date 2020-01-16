package com.qf.service;

import com.qf.entity.ProductType;

import java.util.List;

/**
 * @Package: com.qf.service
 * @CreateDate: 2020/1/6 13:01
 * @Author: JiangXueZhi
 * @Description:    商品种类业务接口
 */
public interface IProductTypeService {
    /*搜索商品种类接口*/
    List<ProductType> listProductType();
}
