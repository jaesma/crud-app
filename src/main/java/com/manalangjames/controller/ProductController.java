package com.manalangjames.controller;

import com.manalangjames.model.Product;
import com.manalangjames.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping({"","/", "/home","/index"})
    public String home(Model model) {
        List<Product> listOfProducts = productService.findAll();
        model.addAttribute("listOfProducts", listOfProducts);
        return "index";
    }
}
