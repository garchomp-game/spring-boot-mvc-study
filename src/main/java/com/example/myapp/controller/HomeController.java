package com.example.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.validation.BindingResult;
import com.example.myapp.model.Inquiry;

@Controller
/**
 * HomeController
 */
public class HomeController {

  @GetMapping("/")
  public String confirm(@ModelAttribute Inquiry inquiry) {
    return "index";
  }

  @PostMapping("/")
  public String confirm(
    @Validated @ModelAttribute Inquiry inquiry,
    BindingResult result
  ) {
    if(result.hasErrors()) {
      return "index";
    }
    return "confirm";
  }
}
