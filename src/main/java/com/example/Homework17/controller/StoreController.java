package com.example.Homework17.controller;

import com.example.Homework17.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/order")
public class StoreController {
    private final StoreService storeService;
    public StoreController(@Autowired StoreService storeService) {
        this.storeService = storeService;
    }
    @GetMapping("/")
    public String main() {
        return "main";
    }
    @PostMapping("/add")
    public String add(@RequestParam String ids, Model model) {
        storeService.add(ids);
        model.addAttribute("ids", storeService.get());
        return "main";
    }
    @GetMapping("/get")
    public String get(Model model) {
        List<Integer> ids = storeService.get();
        model.addAttribute("ids", ids);
        return "getId";
    }
}

