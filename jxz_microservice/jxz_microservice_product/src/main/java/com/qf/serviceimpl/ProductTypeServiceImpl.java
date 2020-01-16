package com.qf.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qf.dao.ProductTypeMapper;
import com.qf.entity.ProductType;
import com.qf.service.IProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Package: com.qf.serviceimpl
 * @CreateDate: 2020/1/6 13:22
 * @Author: JiangXueZhi
 * @Description:    商品种类业务实现类
 */
@Service
public class ProductTypeServiceImpl implements IProductTypeService {

    @Autowired
    private ProductTypeMapper productTypeMapper;
    @Override
    public List<ProductType> listProductType() {
        List<ProductType> produceTypes = productTypeMapper.selectProduceType();
        return produceTypes;
    }
}
