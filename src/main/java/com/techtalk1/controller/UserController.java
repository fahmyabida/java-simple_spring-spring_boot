package com.techtalk1.controller;

import com.techtalk1.model.User;
import com.techtalk1.repository.UserRepository;
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
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/user")
    public List<User> getUserAll() {
        return userRepository.findAll();
    }
}
