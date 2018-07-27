package com.spidermanteam.pizzeriaapp.data;

import com.spidermanteam.pizzeriaapp.model.Cart;
import com.spidermanteam.pizzeriaapp.model.CartLine;

import java.util.List;

public interface CartLineRepository {

    void add(CartLine cartLine);
    void delete(CartLine cartLine);
    void update(CartLine cartLine);
    List<CartLine> listAll();

}
