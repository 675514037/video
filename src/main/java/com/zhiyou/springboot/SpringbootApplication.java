package com.zhiyou.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//用来标示springboot的启动类，是一个组合注解除了包括java 4大元素以外，还包括以下
/*@SpringBootApplication 修饰在类上，可以代替xml配置，用来表示这个类是个xml配置类，一般与@bean结合使用
 * @bean：注解用来修饰方法上，该方法的返回值将会被注册到spring容器中
 * @EnableAutoConfiguration：自动配置spring上下文，可以猜测和配置我们想要的bean类型
 * @ComponentScan：会自动扫描指定包下的componen，controller等注解，并自动注入到ioc容器中，如果不指定路径，默认扫描自己所在包路径及所有子包
 */
@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

}
