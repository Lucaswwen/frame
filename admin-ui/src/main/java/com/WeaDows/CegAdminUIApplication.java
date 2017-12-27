package com.WeaDows;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by SongpoLiu on 2017/7/10.
 */
@SpringBootApplication
@MapperScan("com.WeaDows.mapper")
public class CegAdminUIApplication {

    public static void main(String[] args) {
        SpringApplication.run(CegAdminUIApplication.class, args);
    }
}
