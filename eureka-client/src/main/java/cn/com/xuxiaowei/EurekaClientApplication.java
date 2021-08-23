package cn.com.xuxiaowei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 程序执行入口
 * <p>
 * Eureka Client 服务
 *
 * @author xuxiaowei
 */
@SpringBootApplication
public class EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }

}
