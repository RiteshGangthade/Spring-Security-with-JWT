package com.InventoryManagementSystem.jwt_security.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class TestController {


    Logger logger = LoggerFactory.getLogger(TestController.class);


    @GetMapping
    public String TestMyProject() {
        return "This is testing of our project";
    }
}
