package com.home.controller;

import com.home.domain.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Home {

    @RequestMapping("/home")
    public List<Employee> getEmployees () {
        return Arrays.asList(new Employee("Sumit","Bhoyar"),new Employee("Rashmi","Deshmukh"));

    }
}