package me.kipling.springboot.mybatis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

import me.kipling.springboot.mybatis.common.util.SpringUtil2;
import me.kipling.springboot.mybatis.common.util.SpringUtil3;

@SpringBootApplication
@Import(SpringUtil2.class)
public class Application {

	protected static Logger logger = LoggerFactory.getLogger(Application.class);

	/*@Bean
	public SpringUtil2 getSpringUtil2() {
		return new SpringUtil2();
	}*/
	
	@Bean
	public SpringUtil3 getSpringUtil3() {
		return new SpringUtil3();
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		logger.info("SpringBoot Start Success");
	}
}