package com.vicboma._007_ToSingleton;

import org.junit.Assert;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@EnableAutoConfiguration
@SpringBootApplication
public class AppSpringBootApplication_007 {


	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx =  new AnnotationConfigApplicationContext();
		ctx.register(Configuration_007.class);
		ctx.refresh();

		ServicioA_007 service1 = ctx.getBean(ServicioA_007.class);
		ServicioA_007 service2 = ctx.getBean(ServicioA_007.class);

		Assert.assertSame(service1,service2);
		Assert.assertTrue(service1.toString().equals(service2.toString()));
	}
}
