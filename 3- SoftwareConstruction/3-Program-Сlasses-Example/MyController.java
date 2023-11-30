package com.gleb.lab9.controller;

import com.gleb.lab9.model.RequestFood;
import com.gleb.lab9.service.RequestFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

    @Autowired
    private RequestFoodService requestFoodService;

    @RequestMapping("/")
    public String login() {
        return "main-page";
    }


    @PostMapping("/req-food")
    public String airStateInfo(@RequestParam String productName, @RequestParam String age,
                               @RequestParam String userHeight, @RequestParam String userWeight, Model model) {

        RequestFood requestFood = new RequestFood();
        String food = requestFood.RequestForFood(productName, age, userHeight, userWeight);
        model.addAttribute("food", food);

        return "req-food";
    }
}
