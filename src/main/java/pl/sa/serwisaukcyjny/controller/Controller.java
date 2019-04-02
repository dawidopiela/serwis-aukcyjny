package pl.sa.serwisaukcyjny.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sa.serwisaukcyjny.service.Service;

@RestController
@RequestMapping("/")

public class Controller {

    Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home() {
        return "index";

    }
}