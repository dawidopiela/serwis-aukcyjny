package pl.sa.serwisaukcyjny.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.sa.serwisaukcyjny.model.Product;
import pl.sa.serwisaukcyjny.model.ShoppingCart;
import pl.sa.serwisaukcyjny.service.ShoppingCartService;

import java.util.List;

@Controller
public class CartController {

    ShoppingCartService shoppingCartService;

    @Autowired
    public CartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    //    Service service;
//
//    public FrontController(Service service) {
//        this.service = service;
//    }

    @GetMapping("/cart")
    public String cartView(Model model, Authentication authentication) {
        ShoppingCart shoppingCart = shoppingCartService.getProductByUserEmail(authentication);
        List<Product> products = shoppingCartService.getShoppingCart(shoppingCart);
        model.addAttribute("products", products);
        return "cart";
    }


//    @GetMapping("/")
//    public String addProductToCart(Model model, Authentication authentication, Long id, Product product) {
//        ShoppingCart shoppingCarts = shoppingCartService.getProductByUserEmail(authentication);
//        model.addAttribute("cart", shoppingCartService.addProductToCart(id, product));
//        return "redirect:/";
//    }
}