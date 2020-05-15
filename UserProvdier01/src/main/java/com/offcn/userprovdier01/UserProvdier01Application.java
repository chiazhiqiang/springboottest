package com.offcn.userprovdier01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author chaizhiqiang
 * @email 150069020@qq.com
 * @data 2020/5/13
 */
@SpringBootApplication
@EnableDiscoveryClient
public class UserProvdier01Application {

    public static void main(String[] args) {
        SpringApplication.run(UserProvdier01Application.class,args);
    }
}
