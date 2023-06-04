package com.assignment.hoppersreceipt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HopperController {

    @RequestMapping("/")
    public String index(Model model) {

        String name = "Jon Smith";
        String itemName = "Copper wire";
        double price = 5.34;
        String description = "Metal strips, also an illustration of nanoseconds.";
        String vendor = "Little Things Corner Store";

        // Your code here! Add values to the view model to be rendered

        model.addAttribute("Name",name);
        model.addAttribute("Item",itemName);
        model.addAttribute("Price",price);
        model.addAttribute("Description",description);
        model.addAttribute("Vendor",vendor);
        return "index";
    }
}
