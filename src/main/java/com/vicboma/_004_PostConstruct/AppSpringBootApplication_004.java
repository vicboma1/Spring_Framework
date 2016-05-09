package com.vicboma._004_PostConstruct;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@EnableAutoConfiguration
@SpringBootApplication
public class AppSpringBootApplication_004 {


	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx =  new AnnotationConfigApplicationContext();
		ctx.register(Configuration_004.class);
		ctx.refresh();

		ctx.getBean(ManagerServicio.class)
				.println();

	}
}
