package com.fread.freadbackend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController
{
    @RequestMapping("/home")
    public String index()
    {
        return "index";
    }
}