package aop_config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**完全注解开发
 * @author CJYong
 * @create 2021-08-11 15:23
 */

@Configuration
@ComponentScan(basePackages = {"aop_anno"})
@EnableAspectJAutoProxy(proxyTargetClass = true)

public class ConfigAop {

}
