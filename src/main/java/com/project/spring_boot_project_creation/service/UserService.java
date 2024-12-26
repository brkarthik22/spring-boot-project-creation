package com.project.spring_boot_project_creation.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    public List<String> getAllUsersFromService1() {
        List<String> users = new ArrayList<>();
        users.add("Karthik");
        users.add("Sathya");
        users.add("Vithun");
        users.add("Hari Nishanth");
        users.add("Gugan");
        users.add("My Test Users");
        return users;

    }
    public List<String> getAllUsersFromService2(){
        List <String> users=new ArrayList<>();
        users.add("Karthik");
        users.add("Sathya");
        users.add("HariNishanth");
        users.add("Vithun");
        users.add("My Test Users");
        return users;
    }

}
