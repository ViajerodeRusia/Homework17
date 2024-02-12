package com.example.Homework17.cart;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class Cart {
    private List<Integer> idList = new ArrayList<>();

    public void addId(List<Integer> newId) {
        idList.addAll(newId);
    }

    public List<Integer> getIdList() {
        return Collections.unmodifiableList(idList);
    }
}
