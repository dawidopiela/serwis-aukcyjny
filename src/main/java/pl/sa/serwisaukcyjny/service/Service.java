package pl.sa.serwisaukcyjny.service;

import pl.sa.serwisaukcyjny.controller.Controller;

@org.springframework.stereotype.Service
public class Service {

Controller controller;

    public Service(Controller controller) {
        this.controller = controller;
    }
}
