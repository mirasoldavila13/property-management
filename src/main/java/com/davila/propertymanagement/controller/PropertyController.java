package com.davila.propertymanagement.controller;

import com.davila.propertymanagement.dto.PropertyDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class PropertyController {
    
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello";
    }

    @PostMapping("/properties")
    public PropertyDTO saveProperty(@RequestBody PropertyDTO propertyDTO){
        System.out.println(propertyDTO);
        return propertyDTO;
    }
}
