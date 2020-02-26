package com.dandy.mall.portal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 应用启动入口
 * Created by macro on 2018/4/26.
 */
@EnableDiscoveryClient
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class })
@MapperScan("com.dandy.mall.portal.dao")
public class MallPortalApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallPortalApplication.class, args);
    }
}
