package cn.com.xuxiaowei.actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 程序执行入口
 * <p>
 * 为 Spring Boot 整合 Actuator
 *
 * @author xuxiaowei
 */
@SpringBootApplication
public class ActuatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActuatorApplication.class, args);
    }

}
