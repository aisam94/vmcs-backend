package com.vmcs.vendingmachine.coins;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CoinsService {
    public final CoinsRepository coinsRepository;

    public CoinsService(CoinsRepository coinsRepository){
        this.coinsRepository = coinsRepository;
    }

    public List<Coins> getCoins() {
        return coinsRepository.findAll();
    }

    public Coins saveCoin(Coins coin) {
        return coinsRepository.save(coin);
    }
}
