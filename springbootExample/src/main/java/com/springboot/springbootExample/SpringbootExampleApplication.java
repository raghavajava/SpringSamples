package com.springboot.springbootExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class SpringbootExampleApplication {

	public static void main(String[] args) {
		/*ApplicationContext cc=SpringApplication.run(SpringbootExampleApplication.class, args);
		BinearySearchApp binearySearchApp=  cc.getBean(BinearySearchApp.class);*/
		
		SpringApplication.run(SpringbootExampleApplication.class,args);
		//binearySearchApp.search(10);
	}

}
