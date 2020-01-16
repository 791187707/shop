package com.qf.controller;

import com.github.tobato.fastdfs.domain.StorePath;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @Package: com.qf.controller
 * @CreateDate: 2020/1/9 20:22
 * @Author: JiangXueZhi
 * @Description:    文件上传控制层
 */
@Controller
@RequestMapping("fileUpload")
public class FileController {

    /*存储节点*/
    @Autowired
    private FastFileStorageClient fastFileStorageClient;
    /*拿到yml中的自定义配置图片地址前缀*/
    @Value("${imagePath.server}")
    private String imagePath;


    /*uploadify上传图片   下面方法的参数名    必须与前端页面方法中的fileObjName的value保持一致  */
    @RequestMapping("upload")
    @ResponseBody
    public String upload(MultipartFile file){
        System.out.println("file："+file);
        //得到文件名称
        String originalFilename = file.getOriginalFilename();
        //截取文件名后缀
        String substring = originalFilename.substring(originalFilename.lastIndexOf(".") + 1);

        try {
            //通过springboot将文件保存到FastDFS中(参数固定：输入流，文件大小，文件后缀，null)
            StorePath storePath = fastFileStorageClient.uploadFile(file.getInputStream(), file.getSize(), substring, null);
            //得到文件的路径
            String fullPath = storePath.getFullPath();
            //将图片完整访问路径返回给前端
            System.out.println(imagePath);
           String  completePath =  new StringBuilder(imagePath).append(fullPath).toString();
            System.out.println(completePath);
            return completePath;
        } catch (IOException e) {
            e.printStackTrace();
            return "网络异常，请稍后再试！！";
        }
    }
}
