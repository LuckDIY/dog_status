package com.dog;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@RequestMapping
@SpringBootApplication
public class DogApplication {
    public static void main(String[] args) {
        SpringApplication.run(DogApplication.class);
    }

    @ResponseBody
    @GetMapping("/ok")
    public String ok(){
        return "ok";
    }
}
