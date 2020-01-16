package com.qf.jxz_web_background;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.github.tobato.fastdfs.FdfsClientConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication(scanBasePackages = "com.qf")
//FastDFS的注解
@Import(FdfsClientConfig.class)
public class JxzWebBackgroundApplication {

    public static void main(String[] args) {
        SpringApplication.run(JxzWebBackgroundApplication.class, args);
    }

}
