package com.copado.springbootpoc.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

  @GetMapping("/hello")
  ResponseEntity<String> hello() {
    return ResponseEntity.ok("Hello world");
  }
}
