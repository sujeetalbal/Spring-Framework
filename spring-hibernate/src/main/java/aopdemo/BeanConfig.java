package aopdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan (basePackages = "aopdemo")
@EnableAspectJAutoProxy
public class BeanConfig {

}
