package com.myla.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/index")
    public String show(Model model) {
        model.addAttribute("newOperation", new Operation());

        return "index";
    }

    @PostMapping("/calculate")
    public String calculate(Model model, Operation operation) {
        model.addAttribute("calculationResult", calculatorService.performCalculation(operation.getFirstNum(), operation.getSecondNum(), operation.getOperationType()));
        model.addAttribute("newOperation", new Operation());

        return "index";
    }

}
