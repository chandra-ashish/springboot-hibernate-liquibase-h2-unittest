package com.hibernate.demo;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
//@EnableEurekaClient
@EnableEncryptableProperties
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}


}
