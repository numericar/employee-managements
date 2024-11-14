package com.adoppix.tools.employee.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hellos")
public class HelloController {

    @GetMapping
    public String getHelloView(Model model) {
        return "hellos/index";
    }

}
