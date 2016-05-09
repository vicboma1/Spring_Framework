package com.vicboma._002_Configuration_Bean;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

@EnableAutoConfiguration
@SpringBootApplication
public class AppSpringBootApplication_002 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx =  new AnnotationConfigApplicationContext();
		ctx.register(Configuration_002.class);
		ctx.refresh();

		List<Servicio> serviceList = Arrays.asList(ctx.getBean(ServicioA.class), ctx.getBean(ServicioB.class));
		for(int i = 0; serviceList.size() > i; i++) {
			final Servicio servicio = serviceList.get(i);
			System.out.println(servicio.toString());
		}
	}
}
