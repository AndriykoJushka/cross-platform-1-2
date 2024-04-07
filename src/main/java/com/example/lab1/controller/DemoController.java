package com.example.lab1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/")
public class DemoController {
    @GetMapping
    public String index(Model model) {
        model.addAttribute("pageTitle", "Hello Spring!");
        model.addAttribute("languages", List.of("Java", "Kotlin", "Groovy"));
        model.addAttribute("map", Map.of("key1", "value1", "key2", "value2"));
        model.addAttribute("persona", new Person("Test1"));
        model.addAttribute("persons", List.of(new Person("Person1"), new Person("Person2"),
                new Person("Person45678899")));
        model.addAttribute("index", "123");
        model.addAttribute("task10","dashboard.Persona");
        return "index";//fh
    }
}
