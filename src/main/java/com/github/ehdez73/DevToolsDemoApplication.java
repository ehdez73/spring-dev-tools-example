package com.github.ehdez73;

import org.apache.el.stream.Stream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.IntStream;

@RestController
@SpringBootApplication
public class DevToolsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevToolsDemoApplication.class, args);
	}

	@RequestMapping("/")
    public String sayHello(){
        StringBuffer result = new StringBuffer();
        for (int i=0;i <10; i++){
            result.append(" say-" + i);
        }
        return result.toString();
    }

}
