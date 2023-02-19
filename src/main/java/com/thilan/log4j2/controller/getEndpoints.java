package com.thilan.log4j2.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/vi/blog")
@Log4j2
public class getEndpoints {

    @GetMapping("/hello")
    public ResponseEntity<?> getMessage(){
        log.debug("Inside Controller");
        return new ResponseEntity<>("Hello World", HttpStatus.OK);
    }

}
