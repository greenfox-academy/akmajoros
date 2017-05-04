package com.greenfoxacademy.springstart.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class HelloWebController {
  @RequestMapping("/web/greeting")
  public String greeting(Model model) {
    model.addAttribute(@RequestParam(value = "name") String name);
    return "greeting";
  }
}