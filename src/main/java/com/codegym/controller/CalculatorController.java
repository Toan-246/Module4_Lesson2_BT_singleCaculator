package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {
    @GetMapping("/calculator")
    public String showIndex() {
        return "index";
    }
    @PostMapping ("/calculator")
    public ModelAndView doCalculator (@RequestParam double firstOperand,
                                      @RequestParam double secondOperand,
                                      @RequestParam String operator){
        double result;
        String operatorPrint;
        switch (operator){
            default:
            case "addition":{
                result = firstOperand + secondOperand;
                operatorPrint = "+";
                break;
            }
            case "subtraction": {
                result = firstOperand - secondOperand;
                operatorPrint = "-";
                break;
            }
            case "multiplication": {
                result = firstOperand * secondOperand;
                operatorPrint = "*";
                break;
            }
            case "division": {
                result = firstOperand / secondOperand;
                operatorPrint = "/";
                break;
            }
        }
        String expression = "" + firstOperand + operatorPrint + secondOperand + " = " + result;
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("expression", expression);
        return modelAndView;
    }
}
