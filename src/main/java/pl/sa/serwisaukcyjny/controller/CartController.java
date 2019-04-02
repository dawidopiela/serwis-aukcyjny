package pl.sa.serwisaukcyjny.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CartController {

//    Service service;
//
//    public FrontController(Service service) {
//        this.service = service;
//    }

    @GetMapping("/cart")
    public String home() {
        return "cart";

    }
}