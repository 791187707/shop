package com.qf.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageInfo;
import com.qf.entity.Product;
import com.qf.service.IProductService;
import com.qf.vo.ProductVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Package: com.qf.controller
 * @CreateDate: 2020/1/6 20:33
 * @Author: JiangXueZhi
 * @Description:    商品控制层
 */
@Controller
@RequestMapping("product")
public class ProductController {

    @Reference
    private IProductService productService;

    /*展示全部商品*/
    @RequestMapping("list")
    public String list(Model model){
        List<Product> productList = productService.listProduct();
        model.addAttribute("productList",productList);
        return "product/list";
    }
    /*分页展示全部商品*/
    @RequestMapping("pagelist/{currentPage}/{pageSize}")
    public String list(Model model, @PathVariable Integer currentPage, @PathVariable Integer pageSize){
        PageInfo<Product> productPageInfo = productService.pageListProduct(currentPage,pageSize);
        model.addAttribute("productPageInfo",productPageInfo);
        return "product/list";
    }
    /*添加商品*/
    @PostMapping("addProduct")
    public  String addProduct(ProductVO productVO){
        System.out.println(productVO.getProduct());
        /*返回该商品添加后的商品ID备用*/
        Long productId = productService.addProduct(productVO);
        System.out.println("添加商品成功");
        return "redirect:/product/pagelist/1/2";
    }
    /*删除单个商品*/
    @RequestMapping("deleteOneProduct")
    @ResponseBody
    public int deleteOneProduct(@RequestParam  Long checkedOneID){
        System.out.println("checkedOneID:"+checkedOneID);
        int result = productService.deleteOneProduct(checkedOneID);
        System.out.println("result结果为："+result);
        return result;
    }
}
