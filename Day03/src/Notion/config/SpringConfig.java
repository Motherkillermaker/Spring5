package Notion.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author CJYong
 * @create 2021-08-10 15:31
 */

@Configuration                                        //作为配置类，替代 xml 配置文件
@ComponentScan(basePackages = {"Notion"})
public class SpringConfig {

}
