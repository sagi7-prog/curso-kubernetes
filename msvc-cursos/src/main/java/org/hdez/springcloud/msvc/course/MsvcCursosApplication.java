package org.hdez.springcloud.msvc.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

// Servicio
//@EnableDiscoveryClient

// local
@EnableFeignClients
@SpringBootApplication
public class MsvcCursosApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsvcCursosApplication.class, args);
    }

}
