package com.example.pastebin.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class PastebinController {

    @GetMapping(value = {"/", "/home"})
    public String homePage(){
        return "home";
    }

    @GetMapping("/home/pastebin")
    public String pastebinPage(){
        return "pastebin";
    }

}
