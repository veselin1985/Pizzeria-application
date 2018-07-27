package com.spidermanteam.pizzeriaapp.web;

import com.spidermanteam.pizzeriaapp.model.CartLine;
import com.spidermanteam.pizzeriaapp.service.CartLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/cartlines")
public class CartLineController {

    private CartLineService cartLineService;

    @Autowired
    public CartLineController(CartLineService cartLineService) {
        this.cartLineService = cartLineService;
    }

    @GetMapping("/")
    List<CartLine> listAll() {
        return cartLineService.listAllCartLines();
    }

    @PostMapping("/add")
    void addCartLine(@RequestBody CartLine cartLine) {
        cartLineService.addCartLine(cartLine);
    }

    @DeleteMapping("/delete")
    void deleteCartLine(@RequestBody CartLine cartLine){
        cartLineService.deleteCartLine(cartLine);
    }
    @DeleteMapping("/deleteAll")
    void deleteAll(){
        cartLineService.deleteAllCartLines();
    }
    @PutMapping("/update")
    void update(@RequestBody CartLine cartLine){
        cartLineService.updateCartLine(cartLine);
    }


}
