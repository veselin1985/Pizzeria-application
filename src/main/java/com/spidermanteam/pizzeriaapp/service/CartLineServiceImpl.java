package com.spidermanteam.pizzeriaapp.service;

import com.spidermanteam.pizzeriaapp.data.base.CartLineRepository;
import com.spidermanteam.pizzeriaapp.model.CartLine;
import com.spidermanteam.pizzeriaapp.service.base.CartLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartLineServiceImpl implements CartLineService {

    private CartLineRepository cartLineRepository;

    @Autowired
    public CartLineServiceImpl(CartLineRepository cartLineRepository) {
        this.cartLineRepository = cartLineRepository;
    }


    @Override
    public void addCartLine(CartLine cartLine) {
        cartLineRepository.add(cartLine);
    }

    @Override
    public void deleteCartLine(CartLine cartLine) {
        cartLineRepository.delete(cartLine);
    }

    @Override
    public void deleteAllCartLines() {
        cartLineRepository.deleteAll();
    }

    @Override
    public void updateCartLine(CartLine cartLine) {
        cartLineRepository.update(cartLine);

    }

    @Override
    public List<CartLine> listAllCartLines() {
        return cartLineRepository.listAll();
    }
}
