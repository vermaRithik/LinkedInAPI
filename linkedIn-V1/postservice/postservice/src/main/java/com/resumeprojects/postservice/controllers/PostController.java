package com.resumeprojects.postservice.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/posts")
public class PostController {

    public ResponseEntity<String> createPost(){
        return new ResponseEntity<>("Hi", HttpStatus.CREATED);
    }
}
