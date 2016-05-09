package com.vicboma._003_AutoSettersAttributes;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

@EnableAutoConfiguration
@SpringBootApplication
public class AppSpringBootApplication_003 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx =  new AnnotationConfigApplicationContext();
		ctx.register(Configuration_003.class);
		ctx.refresh();

		List<Servicio_003> serviceList = Arrays.asList(ctx.getBean(ServicioB_003.class), ctx.getBean(ServicioA_003.class));
		for(int i = 0; serviceList.size() > i; i++) {
			final Servicio_003 servicio = serviceList.get(i);
			System.out.println(servicio.toString());
		}
	}
}
