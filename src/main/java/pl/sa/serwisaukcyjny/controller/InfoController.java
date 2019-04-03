package pl.sa.serwisaukcyjny.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InfoController {

//    Service service;
//
//    public FrontController(Service service) {
//        this.service = service;
//    }

    @GetMapping("/info")
    public String Cart() {
        return "blog";

    }
}