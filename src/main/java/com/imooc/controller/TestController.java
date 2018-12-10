package com.imooc.controller;


import com.imooc.dto.TestDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/test")
    public String list(TestDTO testDTO){
        return testDTO.getId();
    }
}
