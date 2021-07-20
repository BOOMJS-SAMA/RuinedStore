package com.ruined.store;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com/ruined/store/mapper")
public class RuinedStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(RuinedStoreApplication.class, args);
    }

}
