package com.jc;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.pagehelper.PageHelper;

@Configuration
public class MyBatisConfiguration {
     @Bean
     public PageHelper pageHelper() {
         PageHelper pageHelper = new PageHelper();
         Properties p = new Properties();
         // 分页合理化默认值为false;
         p.setProperty("reasonable", "true");
         pageHelper.setProperties(p);
         return pageHelper;
     }
}
