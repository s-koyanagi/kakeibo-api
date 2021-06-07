package com.kysh.kakeibo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.kysh.kakeibo","com.kysh.commons"})
public class KakeiboApplication {
    public static void main(String[] args) {
        SpringApplication.run(KakeiboApplication.class, args);
    }
}
