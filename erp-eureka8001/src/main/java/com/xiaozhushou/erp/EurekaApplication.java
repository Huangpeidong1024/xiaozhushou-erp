package com.xiaozhushou.erp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description: TODO
 * @ProjectName: xiaozhushou-erp
 * @Package: com.xiaozhushou.erp
 * @Author: HuangPeiDong
 * @CreateDate: 2019/12/24 16:55
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }
}