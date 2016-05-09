package com.vicboma._006_ToPrototype;

import org.junit.Assert;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@EnableAutoConfiguration
@SpringBootApplication
public class AppSpringBootApplication_006 {


	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx =  new AnnotationConfigApplicationContext();
		ctx.register(Configuration_006.class);
		ctx.refresh();

		ServicioA_006 service1 = ctx.getBean(ServicioA_006.class);
		ServicioA_006 service2 = ctx.getBean(ServicioA_006.class);

		Assert.assertNotSame(service1,service2);
		Assert.assertTrue(service1.toString().equals(service2.toString()));
	}
}
