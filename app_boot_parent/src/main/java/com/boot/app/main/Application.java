package com.boot.app.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.ComponentScan;

/**
 *<p> Created by gxx on 2017-08-31.
 *<p>网上有参考价值的信息: http://blog.csdn.net/gebitan505/article/details/54929287
 *<p> 此demo数据库访问采用配置文件
 *<p> 此demo不足之处，没有配置profile
 *<p> 此dmeo支持生产上线自动部署，1、mvn clean package 打包(jar); 2、进入jar路径下，执行java -jar appSpringBoot.jar即可
 */
@SpringBootApplication
@ComponentScan(value = "com.boot.app")
@MapperScan(value = "com.boot.app.mapper")
public class Application implements EmbeddedServletContainerCustomizer {

    public static void main(String[] args){
        System.out.println("start....");
        SpringApplication.run(Application.class);
        System.out.println("【success】");
    }

    /*****
     * <p>修改boot内置tomcat端口
     * @param configurableEmbeddedServletContainer
     */
    public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {
        configurableEmbeddedServletContainer.setPort(8089);
    }
}
