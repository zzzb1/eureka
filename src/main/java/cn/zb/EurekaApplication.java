package cn.zb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zb Created in 10:45 PM 2018/5/14
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication{

//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(EurekaApplication.class);
//    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }

}
