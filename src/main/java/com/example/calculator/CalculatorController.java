package com.example.calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;
    @GetMapping
    public String calculatorPlus(Integer num1, Integer num2){
        if(num1 == null || num2 == null){
            return "Ошибка! Передайте параметр";
        }
        return String.valueOf(calculatorService.plus(5,5));
    }

    @GetMapping
    public String calculatorMinus(Integer num1, Integer num2) {
        if(num1 == null || num2 == null){
            return "Ошибка! Передайте параметр";
        }
        return String.valueOf(calculatorService.minus(5,5));
    }

    @GetMapping
    public String multiply(Integer num1, Integer num2) {
        if(num1 == null || num2 == null){
            return "Ошибка! Передайте параметр";
        }
        return String.valueOf(calculatorService.multiply(5,5));
    }
    @GetMapping
    public String divide(Integer num1, Integer num2) {
        if(num1 == null || num2 == null){
            return "Ошибка! Передайте параметр";
        }else if (num1 == 0 || num2 == 0){
            return "Ошибка! На 0 делить нельзя";
        }
        return String.valueOf(calculatorService.divide(5,5));
    }
}

