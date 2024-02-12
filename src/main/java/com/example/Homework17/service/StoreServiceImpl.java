package com.example.Homework17.service;

import com.example.Homework17.cart.Cart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {
    private final Cart cart;

    public StoreServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void add(List<Integer> id) {
        cart.addId(id);
    }
    @Override
    public List<Integer> get() {
        return cart.getIdList();
    }
}