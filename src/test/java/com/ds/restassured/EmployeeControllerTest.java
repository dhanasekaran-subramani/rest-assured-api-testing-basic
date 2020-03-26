package com.ds.restassured;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class EmployeeControllerTest {

    // To run this test application should be up and running and below API should be available
    @Test
    public void listAllEmployees()
    {
    RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8080/restassured/employees",String.class);
    System.out.println("response --->> "+ response);
    assertEquals(response.getStatusCode(), HttpStatus.OK);
    assertTrue(response.getBody().contains("Dhanasekaran"));
    }






}
