package com.cos.blog.test;



import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})

public class BlogControllerTest {
	//http://localhost:8080/test/hello
@GetMapping("/test/hello")
	public String hello() {
		return "<h1>hello spring boot</h1>";
}
}
