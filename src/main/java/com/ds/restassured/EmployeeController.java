package com.ds.restassured;

import jdk.jfr.ContentType;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeType;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeController {

    @RequestMapping(path= {"/restassured/employees"},  produces = {MimeTypeUtils.APPLICATION_JSON_VALUE}, method = RequestMethod.GET)
    public ResponseEntity<List<String>> listAllEmployees()
    {
        String[] employees = {"Dhanasekaran","Subramani","viswanth","lakshanya"};

     return new ResponseEntity(Arrays.asList(employees),HttpStatus.OK);
    }
}
