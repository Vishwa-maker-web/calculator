package com.example.calculator.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @GetMapping("/add")
    public int add(@RequestParam int a,@RequestParam int b){
        return a+b;
    }

    @GetMapping("/multiply")
    public int mul(@RequestParam int a,@RequestParam int b){
        return a*b;
    }

    @GetMapping("/divide")
    public int div(@RequestParam int a,@RequestParam int b){
        return a/b;
    }

    @GetMapping("/subtract")
    public int sub(@RequestParam int a,@RequestParam int b){
        return a-b;
    }


}
