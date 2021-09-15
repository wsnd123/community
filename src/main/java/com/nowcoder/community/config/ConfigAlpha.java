package com.nowcoder.community.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

@Configuration//表示这是一个配置类   与配置类相关的扫描组件
public class ConfigAlpha {

    @Bean//方法名就是Bean的名字   这个方法返回的值将会被装配到容器中
    public SimpleDateFormat simpleDateFormat(){
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }
}
