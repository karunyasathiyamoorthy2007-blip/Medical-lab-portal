package com.karunya.medicallabportal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TestController 
{

    @GetMapping("/")
    public String home() 
    {
        return "Medical Lab Portal is Running Successfully!";
    }
}
