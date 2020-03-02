package jugaad.demoService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

@SpringBootApplication
public class DemoServiceApplication{

	private Logger logger = LoggerFactory.getLogger(DemoServiceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoServiceApplication.class, args);
	}
}
