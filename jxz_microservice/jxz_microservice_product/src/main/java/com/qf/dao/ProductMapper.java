package com.qf.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qf.entity.Product;

import java.util.List;

/**     
  * @Package:        com.qf.dao
  * @CreateDate:     2020/1/6 18:51
  * @Author:         JiangXueZhi
  * @Description:       
  */
public interface ProductMapper extends BaseMapper<Product> {
    int deleteByPrimaryKey(Long id);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    /*查询商品*/
    List<Product> listProduct();

    /*假删除*/
    int pretendDeleteByPrimaryKey(Long checkedOneID);
}