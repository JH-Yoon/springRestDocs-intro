package com.example.demoDocs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoDocsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoDocsApplication.class, args);
	}

	@RestController
	private static class SampleController {

		@RequestMapping("/")
		public String index() {
			return "Hello, World";
		}

	}

}
