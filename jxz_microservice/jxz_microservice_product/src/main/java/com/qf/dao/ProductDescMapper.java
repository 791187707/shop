package com.qf.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qf.entity.ProductDesc;

/**     
  * @Package:        com.qf.dao
  * @CreateDate:     2020/1/6 18:51
  * @Author:         JiangXueZhi
  * @Description:       
  */
public interface ProductDescMapper extends BaseMapper<ProductDesc> {
    int deleteByPrimaryKey(Long id);

    int insert(ProductDesc record);

    int insertSelective(ProductDesc record);

    ProductDesc selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ProductDesc record);

    int updateByPrimaryKey(ProductDesc record);
}