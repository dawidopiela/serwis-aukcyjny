package pl.sa.serwisaukcyjny.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.sa.serwisaukcyjny.model.dto.UserDto;
import pl.sa.serwisaukcyjny.service.UserService;

import javax.validation.Valid;

@Controller
public class UserController {

    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/checkout")
    public String register(Model model, Authentication auth){
        model.addAttribute("user", new UserDto());
        model.addAttribute("auth",auth);
        return "checkout";
    }

    @PostMapping("/checkout")
    public String register(@ModelAttribute("user") @Valid UserDto userDto, BindingResult bindingResult, Model model, Authentication auth){
        if(bindingResult.hasErrors()){
            System.out.println(bindingResult.getRawFieldValue("name"));
            model.addAttribute("auth",auth);
            return "checkout";
        }

        System.out.println("Zarejestrowano: " + userService.addUser(userDto));
        return "redirect:/";
    }

    @GetMapping("/login")
    public String login(Model model, Authentication auth){
        model.addAttribute("auth",auth);
        return "login";
    }
}
