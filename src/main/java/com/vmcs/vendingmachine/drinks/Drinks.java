package com.vmcs.vendingmachine.drinks;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Drinks {
    @Id
    @Column
    private int id;

    @Column
    private String brand;

    @Column
    private double price;

    @Column
    private int quantity;

    @Column
    private int max_quantity;

/*
    public Drinks(String brand, double price, int quantity, int max_quantity){
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
        this.max_quantity = max_quantity;
    }
*/
}
