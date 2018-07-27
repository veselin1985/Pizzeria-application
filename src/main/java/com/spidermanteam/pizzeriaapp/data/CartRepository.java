package com.spidermanteam.pizzeriaapp.data;

import com.spidermanteam.pizzeriaapp.model.Cart;
import com.spidermanteam.pizzeriaapp.model.CartLine;

public interface CartRepository {

    void addCartLine(CartLine cartLine);
    void addCart(Cart cart);
}
