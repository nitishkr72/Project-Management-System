package com.orca.pms.controller;

import com.orca.pms.dto.EmployeeDTO;
import com.orca.pms.dto.EmployeeRegisterDTO;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

    @PostMapping("/register")
    public ResponseEntity<EmployeeDTO> registerAccount(@RequestBody EmployeeRegisterDTO employeeRegisterDTO) {
        return new ResponseEntity<>(EmployeeDTO.builder().emailId(employeeRegisterDTO.getEmailId()).build(), new HttpHeaders(), HttpStatus.OK);
    }
}
