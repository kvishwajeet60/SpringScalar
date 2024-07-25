package com.scalar.SampleDemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //GET call --> /hello --> Hello World with http status code = 200 ok

    @GetMapping("/hello")   //http://localhost:8080/hello
    public ResponseEntity helloworld(){
        //String hello = "HELLO WORLD!";
        //return ResponseEntity.ok(hello); //wrap hello string in http status code 200 ok

        Person p = new Person("BITTU", 25, "HEY BITTU!!");
        return ResponseEntity.ok(p);
    }
}
