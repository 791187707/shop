package com.qf.serviceimpl;


import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.dao.ProductDescMapper;
import com.qf.dao.ProductMapper;
import com.qf.entity.Product;
import com.qf.entity.ProductDesc;
import com.qf.service.IProductService;
import com.qf.vo.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
 * @Package: com.qf.serviceimpl
 * @CreateDate: 2020/1/6 21:07
 * @Author: JiangXueZhi
 * @Description:
 */
@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private ProductDescMapper productDescMapper;

    /*查询所有商品*/
    @Override
    public List<Product> listProduct() {
        return productMapper.listProduct();
    }

    /*分页查询所有商品*/
    @Override
    public PageInfo<Product> pageListProduct(Integer currentPage, Integer pageSize) {
        PageHelper.startPage(currentPage,pageSize);   //得到当前页与每页显示条数
        List<Product> productList = productMapper.listProduct();    //得到待分页的集合
        PageInfo<Product> productPageInfo = new PageInfo<Product>(productList,3);  //开始分页 设置显示页码数
        return productPageInfo;
    }

    /*商品添加*/
    @Override
    public Long addProduct(ProductVO productVO) {
        //添加商品
        Product product = productVO.getProduct();
        //因为数据库中其他属性皆不可为空 需手动补全
        product.setFlag(true);
        product.setCreattime(new Date());
        product.setUpdatetime(product.getCreattime());
        product.setCreatuser(1l);
        product.setUpdateuser(product.getCreatuser());
        productMapper.insertSelective(product);
        //添加商品描述
        ProductDesc productDesc = new ProductDesc();
        //因为数据库中其他属性皆不可为空 需手动补全
        System.out.println(product.getId());
        productDesc.setProductId(product.getId());
        productDesc.setProductDesc(productVO.getProductDesc());
        productDescMapper.insertSelective(productDesc);
        //返回该商品的ID（主键回填)
        return product.getId();
    }

    /*删除单个商品*/
    @Override
    public int deleteOneProduct(Long checkedOneID) {
        int deleteResult = productMapper.pretendDeleteByPrimaryKey(checkedOneID);
        return deleteResult;
    }

}
