package com.team36.webProg;

//import org.hibernate.cfg.Environment;
import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class WebProgApplication {

	@Autowired
	private Environment env;
	public static void main(String[] args) {
		SpringApplication.run(WebProgApplication.class, args);
	}

	/*@Autowired
	public void LinkOpenAPI() {
		System.out.println("Link za OpenAPI UI: http://localhost:" + env.getProperty("server.port") + "/swagger-ui/index.html#/");
		System.out.println("Link za Client Server [Front]: http://localhost:" + env.getProperty("front.port") + "/");
	}*/

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("*").allowedMethods("*").allowedHeaders("*");
			}
		};
	}


}
