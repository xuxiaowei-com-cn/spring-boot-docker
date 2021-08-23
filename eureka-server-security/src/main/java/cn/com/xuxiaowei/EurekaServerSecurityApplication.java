package cn.com.xuxiaowei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 程序执行入口
 * <p>
 * Eureka Server Security 注册中心
 *
 * @author xuxiaowei
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerSecurityApplication.class, args);
    }

}
