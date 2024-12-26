package com.project.spring_boot_project_creation.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    public List<String> getAllUsersFromService() {
        List<String> users = Arrays.asList(
                "Karthik",
                "Sathya",
                "Vithun",
                "Hari Nishanth",
                "Gugan"
        );
        return users;
    }
}
