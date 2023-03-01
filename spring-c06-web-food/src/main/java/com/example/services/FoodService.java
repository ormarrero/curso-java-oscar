package com.example.services;

import com.example.entities.Food;

import java.util.List;
import java.util.Optional;

public interface FoodService {

    //CRUD
    List<Food>findAll();
    Optional<Food> findById(Long id);

    List<Food> findAllByCategory(String category);
    List<Food> findByColor(String color);
    List<Food> findByCategoryAndColor(String category, String color);

    Object findAllByColor(String color);

    Object findAllByCategoryAndColor(String category, String color);
    Food save(Food food);
    void deleteById(Long id);

    //LÓGICA DE NEGOCIO
}
