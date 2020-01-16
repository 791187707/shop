package com.qf.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qf.entity.ProductType;

import java.util.List;

/**     
  * @Package:        com.qf.dao
  * @CreateDate:     2020/1/6 18:52
  * @Author:         JiangXueZhi
  * @Description:       
  */
public interface ProductTypeMapper extends BaseMapper<ProductType> {
    int deleteByPrimaryKey(Long id);

    int insert(ProductType record);

    int insertSelective(ProductType record);

    ProductType selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ProductType record);

    int updateByPrimaryKey(ProductType record);

    /*查询所有商品种类*/
    List<ProductType> selectProduceType();
}