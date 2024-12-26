package com.project.spring_boot_project_creation.controller;


import com.project.spring_boot_project_creation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/all")
    public ResponseEntity<List<String>> getAllUsersFromController() {
        List<String> users = userService.getAllUsersFromService();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/v1/all")
    public ResponseEntity<List<String>> getAllUsersFromController1() {
        List<String> users = userService.getAllUsersFromService1();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/v2/all")
    public ResponseEntity<List<String>> getAllUsersFromController2(){
        List<String> users = userService.getAllUsersFromService2();
        return ResponseEntity.ok(users);
    }


}
