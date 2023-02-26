package com.example.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author programmerGoGo
 * @Description
 */
@Configuration
@MapperScan("com.example.mall.mybatis.mapper")
public class MybatisConfig {
}
