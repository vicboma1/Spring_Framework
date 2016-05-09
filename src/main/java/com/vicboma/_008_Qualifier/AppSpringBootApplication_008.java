package com.vicboma._008_Qualifier;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@EnableAutoConfiguration
@SpringBootApplication
public class AppSpringBootApplication_008 {



	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx =  new AnnotationConfigApplicationContext();
		ctx.register(Configuration_008.class);
		ctx.refresh();


		Mediator mediator = ctx.getBean(Mediator.class);
		System.out.println(mediator.toString());
	}
}
