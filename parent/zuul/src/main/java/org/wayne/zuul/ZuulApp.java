package org.wayne.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Description:
 * 1. @EnableDiscoveryClient 注册服务
 * 2. @EnableZuulProxy 开启Zuul网关
 * @author: LinWeiQi
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy //开启网关
public class ZuulApp {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApp.class,args);
    }
}
