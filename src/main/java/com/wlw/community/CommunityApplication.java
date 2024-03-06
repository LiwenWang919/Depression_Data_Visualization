package com.wlw.community;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.annotation.PostConstruct;

/**
 * @author 17500
 */

@SpringBootApplication
@EnableWebMvc
public class CommunityApplication {

	@PostConstruct
	public void init(){
		// 解决netty启动冲突问题
		// 来自Netty4Utils.setAvailableProcessors()
		System.setProperty("es.set.netty.runtime.available.processors","false");
	}

	public static void main(String[] args) {

		SpringApplication.run(CommunityApplication.class, args);

	}

}
