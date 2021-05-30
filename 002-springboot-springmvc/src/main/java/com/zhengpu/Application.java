package com.zhengpu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//SpringBoot项目启动入口类
@SpringBootApplication //开启springboot配置
public class Application {
//    springboot项目代码必须放在Application类的同级目录获取子目录中
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
