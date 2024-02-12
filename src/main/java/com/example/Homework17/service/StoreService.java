package com.example.Homework17.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StoreService {
    void add(List<Integer> id);
    List<Integer> get();

}
