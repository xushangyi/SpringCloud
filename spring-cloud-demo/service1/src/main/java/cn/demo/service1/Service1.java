package cn.demo.service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/8/17.
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class Service1 {

    public static void main(String[] args) {
        SpringApplication.run(Service1.class, args);
    }
    @GetMapping("/service1")
    public String service1() {
        return "service1";
    }
}
