package com.resumeprojects.postservice.controllers;

import com.resumeprojects.postservice.DTO.PostDto;
import com.resumeprojects.postservice.DTO.PostReqDto;
import com.resumeprojects.postservice.Service.PostService;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/posts")

public class PostController {

    private final PostService postService;
    
    public PostController(PostService postService) {
    	this.postService = postService;
    }

    @PostMapping
    public ResponseEntity<PostDto> createPost(@RequestBody PostReqDto post){
    	Long id = 1L;
    	PostDto postDto = postService.createPosts(post,id);
     return new ResponseEntity<>(postDto, HttpStatus.CREATED);
    }
}
