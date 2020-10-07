package org.westos.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author lwj
 * @date 2020/10/7 16:50
 */
@Configuration
@ComponentScan(basePackages = {"org.westos"})
public class SpringConfig {
    //作为配置类，替代xml配置文件
}
