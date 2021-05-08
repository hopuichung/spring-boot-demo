package com.mhho.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.mhho.demo.model.Post;

import org.springframework.stereotype.Service;

@Service
public class PostService {

    private List<Post> posts;

    public PostService() {
        // create sample list of posts, normally should be asking database for results
        posts = new ArrayList<>();
        posts.add(new Post("1", "testing post body..."));
        posts.add(new Post("2", "another post body..."));
    }

    public Post getPost(String postId) {
        
        Optional<Post> optionalPost = posts.stream().filter(post -> post.getPostId().equals(postId)).findFirst();

        if (optionalPost.isPresent()) {
            return optionalPost.get();
        } else {
            return null;
        }
    }
}
