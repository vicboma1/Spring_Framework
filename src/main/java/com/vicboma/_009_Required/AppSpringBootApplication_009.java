package com.vicboma._009_Required;

import org.junit.Assert;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@EnableAutoConfiguration
@SpringBootApplication
public class AppSpringBootApplication_009 {


	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx =  new AnnotationConfigApplicationContext();
		ctx.register(Configuration_009.class);
		ctx.refresh();

		ServicioA_009 service1 = ctx.getBean(ServicioA_009.class);

		Assert.assertNotNull(service1.objectable);
	}
}
