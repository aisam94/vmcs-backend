package com.vmcs.vendingmachine.drinks;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DrinksService {
    private final DrinksRepository drinksRepository;

    public DrinksService(DrinksRepository drinksRepository){
        this.drinksRepository = drinksRepository;
    }

    public List<Drinks> getDrinks() {
        return drinksRepository.findAll();
    }

    public Drinks saveDrink(Drinks drink){
        return drinksRepository.save(drink);
    }

}
