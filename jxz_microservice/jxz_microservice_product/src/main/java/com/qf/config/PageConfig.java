package com.qf.config;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * @Package: com.qf.config
 * @CreateDate: 2020/1/7 9:49
 * @Author: JiangXueZhi
 * @Description:    分页 配置类
 */
@Configuration
public class PageConfig {

    @Bean
    public PageHelper getPageHelper(){

        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("dialect","mysql");
        properties.setProperty("reasonable","true");
        pageHelper.setProperties(properties);
        return pageHelper;
    }
}
