package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("")
@Controller
public class DefaultController {
    @GetMapping("index") //이 안에 있는 주소값은 꼭 유니크해야함. 클래스 안에서!
    public String index() {
        return "index";
    }

}
