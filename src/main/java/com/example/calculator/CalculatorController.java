package com.example.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;
    public CalculatorController(CalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/calculator")
    public String calculator(){
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping(path = "/calculator/plus")
    public String plus (@RequestParam Integer num1,@RequestParam Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка! Передайте параметр";
        }
        return String.valueOf(calculatorService.plus(num1,num2));
        }

    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam Integer num1,@RequestParam Integer num2) {
        if(num1 == null || num2 == null){
            return "Ошибка! Передайте параметр";
        }
        return String.valueOf(calculatorService.minus(num1,num2));
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam Integer num1,@RequestParam Integer num2) {
        if(num1 == null || num2 == null){
            return "Ошибка! Передайте параметр";
        }
        return String.valueOf(calculatorService.multiply(num1,num2));
    }
    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam Integer num1,@RequestParam Integer num2) {
        if(num1 == null || num2 == null){
            return "Ошибка! Передайте параметр";
        }else if (num1 == 0 || num2 == 0){
            return "Ошибка! На 0 делить нельзя";
        }
        return String.valueOf(calculatorService.divide(num1,num2));
    }
}

