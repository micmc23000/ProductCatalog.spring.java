package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author Michael
 */
@Controller
public class AppController {

    @RequestMapping("/")
    public String getLandingPage() {
        System.out.println("getLandingPage");
        return "index";
    }

    
    @RequestMapping("/allproducts")
    public String getAllProductsPage() {
        System.out.println("getAllProductsPage");
        return "allProducts";
    }
    
    @RequestMapping("/products")
    public String getProductsPage() {
        System.out.println("getProductsPage");
        return "products";
    }

    @RequestMapping("/url")
    public String page(Model model) {
        model.addAttribute("attribute", "value");
        return "view.name";
    }
    
    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Error message")
    public void handleError() {
    }
    
}
