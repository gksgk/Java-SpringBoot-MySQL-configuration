package com.example.aws_java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Autowired
    EmployeeRepo repo;

    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }

    @GetMapping("/home")
    public String home(){
        return "Welcome to home page";
    }

    @PostMapping("/addEmployee")
    public ResponseEntity<Void> addEmployee(@RequestBody EmployeeDto employeeDto){
        Employee employee = new Employee();
        employee.setName(employeeDto.getName());
        employee.setEmail(employeeDto.getEmail());
        repo.save(employee);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
