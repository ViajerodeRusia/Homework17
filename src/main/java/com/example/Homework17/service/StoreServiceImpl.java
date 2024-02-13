package com.example.Homework17.service;

import com.example.Homework17.cart.Cart;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {
    private final Cart cart;

    public StoreServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void add(String ids) {
        String[] idArray = ids.split(",");
        List<Integer> idList = new ArrayList<>();
        for (String id : idArray) {
            try {
                Integer idValue = Integer.parseInt(id);
                idList.add(idValue);
            } catch (NumberFormatException e) {
                System.err.println("Ошибка формата числа при парсинге" + e.getMessage());
            }
        }
        cart.addId(idList);
    }
    @Override
    public List<Integer> get() {
        return cart.getIdList();
    }
}