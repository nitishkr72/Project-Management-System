package com.orca.pms.controller;


import com.orca.pms.model.Employees;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/getEmployee")
    public ResponseEntity<Employees> getEmployee() {
        return new ResponseEntity<>(Employees.builder().firstName("Nitish").lastName("Kumar").dateOfJoining(new Date()).build(), new HttpHeaders(), HttpStatus.OK);
    }


}
