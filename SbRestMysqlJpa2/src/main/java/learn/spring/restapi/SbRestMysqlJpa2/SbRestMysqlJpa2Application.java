package learn.spring.restapi.SbRestMysqlJpa2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
@Configuration
public class SbRestMysqlJpa2Application {

	public static void main(String[] args) {
		SpringApplication.run(SbRestMysqlJpa2Application.class, args);
		System.out.println("Started");
	}
	

}
