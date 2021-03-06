package com.spidermanteam.pizzeriaapp.service.base;

import com.spidermanteam.pizzeriaapp.model.CartLine;

import java.util.List;

public interface CartLineService {

    void addCartLine(CartLine cartLine);
    void deleteCartLine(CartLine cartLine);
    void deleteAllCartLines();
    void updateCartLine(CartLine cartLine);
    List<CartLine> listAllCartLines();
}
