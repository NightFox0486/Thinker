package thinkers.thinkers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:/properties/env.properties")
public class ThinkersApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThinkersApplication.class, args);
	}

}
