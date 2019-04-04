package pl.sa.serwisaukcyjny.controller;

import org.springframework.security.core.Authentication;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.sa.serwisaukcyjny.model.dto.UserDto;

import javax.validation.Valid;

public class LoginControler {

    @GetMapping("/login")
    public String register(Model model, Authentication auth) {
        model.addAttribute("user", new UserDto());
        model.addAttribute("auth", auth);
        return "login";
    }

    @PostMapping("/login")
    public String register(@ModelAttribute("user") @Valid UserDto userDto, BindingResult bindingResult, Model model, Authentication auth) {
        if (bindingResult.hasErrors()) {
            System.out.println(bindingResult.getRawFieldValue("name"));
            model.addAttribute("auth", auth);
            return "login";
        }
      //  System.out.println("Zarejestrowano: " + userService.addUser(userDto));
        return "redirect:/";
    }
}
