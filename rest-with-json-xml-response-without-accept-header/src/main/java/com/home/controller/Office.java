package com.home.controller;

import com.home.domain.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Office {

    @RequestMapping(value = "/employee")
    public @ResponseBody ResponseEntity<Employee> getEmployee () {
        return new ResponseEntity<Employee>(new Employee(1, "Sumit","Bhoyar", "sumit@gmail.com"), HttpStatus.ACCEPTED);
    }
}