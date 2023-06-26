package com.itheima.config;

import org.springframework.context.annotation.*;

/**
 * @author Mendy
 * @create 2023-06-26 9:43
 */
@Configuration
@ComponentScan("com.itheima")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class,MybatisConfig.class})
@EnableAspectJAutoProxy
public class SpringConfig {
}

