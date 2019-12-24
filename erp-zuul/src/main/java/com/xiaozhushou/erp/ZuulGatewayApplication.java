package com.xiaozhushou.erp;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
* @Description:
* @Author: HuangPeiDong
* @Date: 2019/12/24 19:36
* @Param:
* @Return:
**/
@EnableZuulProxy
@SpringCloudApplication
public class ZuulGatewayApplication {

    public static void main(String[] args) {

        SpringApplication.run(ZuulGatewayApplication.class, args);
    }
}
