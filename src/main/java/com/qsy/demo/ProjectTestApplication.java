package com.qsy.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class ProjectTestApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ProjectTestApplication.class, args);
		System.out.println("测试项目启动，启动环境：" + Arrays.toString(context.getEnvironment().getActiveProfiles()));
	}

}
