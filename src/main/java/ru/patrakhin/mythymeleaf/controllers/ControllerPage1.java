package ru.patrakhin.mythymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerPage1 {
        @GetMapping("/")
        public String index(Model model) {
            model.addAttribute("pageTitle", "Default Page Title");
            model.addAttribute("pageText", "Default page text goes here");
            return "page1";
        }
}
