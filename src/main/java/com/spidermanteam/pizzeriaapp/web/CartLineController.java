package com.spidermanteam.pizzeriaapp.web;

import com.spidermanteam.pizzeriaapp.service.CartLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cartlines")
public class CartLineController {

    private CartLineService cartLineService;

    @Autowired
    public CartLineController (CartLineService cartLineService){
        this.cartLineService = cartLineService;
    }


}
