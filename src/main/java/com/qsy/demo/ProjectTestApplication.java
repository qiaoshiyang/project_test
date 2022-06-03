package com.qsy.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
@Slf4j
public class ProjectTestApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ProjectTestApplication.class, args);
		log.info("项目启动，启动环境：【{}】", Arrays.toString(context.getEnvironment().getActiveProfiles()));
	}

}
