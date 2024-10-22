package com.example.demo.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/notice")
@Controller
public class NoticeController {
    @GetMapping("/{page}")
    public String page(@PathVariable String page){
        return "notice/" + page;
    }

    //PathVariable을 여러개 쓸수 있음.. 대신 /가 있어야함!
    @GetMapping("/{page}/{id}")

    public String page2(@PathVariable String page, @PathVariable String id){
        // System.out.println(id); http://localhost:8080/board/list/123  -> page : list , id : 123
        return "notice/" + page;
    }


}

