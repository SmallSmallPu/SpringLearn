package com.zhengpu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//扫描mapper类，交给spring管理 在此处添加了该注释之后就可以不同在每个mapper接口中写@Mapper注释
@MapperScan(basePackages = "com.zhengpu.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
