package com.qf.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.entity.ProductType;
import com.qf.service.IProductTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Package: com.qf.controller
 * @CreateDate: 2020/1/6 16:00
 * @Author: JiangXueZhi
 * @Description:    商品类别控制层
 */
@Controller
@RequestMapping("productType")
public class ProductTypeController {

    @Reference
    private IProductTypeService productTypeService;

    /*测试项目构建是否成功*/
    @RequestMapping("selectProduceType")
    public String  selectProduceType(Model model){
        List<ProductType> produceType = productTypeService.listProductType();
        model.addAttribute("produceType",produceType);
        return "a";
    }
}
