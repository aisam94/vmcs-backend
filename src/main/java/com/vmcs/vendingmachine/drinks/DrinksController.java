package com.vmcs.vendingmachine.drinks;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class DrinksController {
    @Autowired
    DrinksService drinksService;

    @GetMapping(path = "/drinks")
    public ResponseEntity<?> listDrinks(){
        List<Drinks> resource = drinksService.getDrinks();
        return ResponseEntity.ok(resource);
    }

    @PostMapping(path = "/drinks")
    public ResponseEntity<?> saveDrink(@RequestBody Drinks drink){
        Drinks resource = drinksService.saveDrink(drink);
        return ResponseEntity.ok(resource);
    }
}
