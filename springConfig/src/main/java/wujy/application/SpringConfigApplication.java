package wujy.application;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class SpringConfigApplication {
	
	public static void main(String[] args){
		new SpringApplicationBuilder(SpringConfigApplication.class).web(true).run(args);
	}
}
