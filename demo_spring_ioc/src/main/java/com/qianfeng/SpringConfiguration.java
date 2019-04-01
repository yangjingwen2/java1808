package com.qianfeng;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Spring的入口类.@Configuration注解定义当前类为入口类
 */
@Configuration
//秘书要扫描那些包下的类
@ComponentScan("com.qianfeng")
public class SpringConfiguration {
}
