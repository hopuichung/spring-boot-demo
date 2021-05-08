package com.mhho.demo.controller;

import com.mhho.demo.model.Post;
import com.mhho.demo.service.PostService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
    
    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/posts/{postId}")
    public Post getPostById(@PathVariable String postId) {
        return postService.getPost(postId);
    }
}
