package com.vmcs.vendingmachine.coins;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Coins {
    @Id
    @Column
    private int id;

    @Column
    private String denomination;

    @Column
    private int quantity;

    @Column
    private int max_quantity;
}
