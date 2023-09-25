package com.example.HW7.controllers;

import com.example.HW7.server.EmployService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class MainController {

    private final EmployService employService;
    @GetMapping("/")
    public String mainTemplate() {
        return "index";
    }

    @GetMapping("/employs")
    public String about(Model model) {
        model.addAttribute("employ", employService.listEmploy());
        return "employs";
    }

    @GetMapping("/add")
    public String add() {
        return "addNewEmploy";
    }

    @PostMapping("/add")
    public String add(
            @RequestParam String name,
            @RequestParam String grade,
            @RequestParam int age
    ) {
        employService.add(name,grade,age);
        return "redirect:/employs";
    }
}
