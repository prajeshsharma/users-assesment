package com.user.controller;

import com.user.entity.User;
import com.user.repository.UserRepository;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("api/")
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    public User add(@Validated @RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping("/user")
    public List<User> listUsers() {
        return this.userRepository.findAll();
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id) {
        userService.delete(id);
        return ResponseEntity.ok().build();
    }
}
