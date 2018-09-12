package com.techtalk1.controller;

import com.techtalk1.model.Post;
import com.techtalk1.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Fahmy Abida
 * Email : fahmyabida@gmail.com
 */

@CrossOrigin
@RestController
@RequestMapping("/public")
public class PostController {

    @Autowired
    PostRepository postRepository;

    @GetMapping("/user")
    public List<Post> getUserAll() {
        return postRepository.findAll();
    }
}
