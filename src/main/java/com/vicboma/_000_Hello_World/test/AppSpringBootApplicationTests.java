package com.vicboma._000_Hello_World.test;

import com.vicboma._000_Hello_World.AppSpringBootApplication_000;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AppSpringBootApplication_000.class)
@WebAppConfiguration
public class AppSpringBootApplicationTests {

	@Test
	public void contextLoads() {
	}

}
