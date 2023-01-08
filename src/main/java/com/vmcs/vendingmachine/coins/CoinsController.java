package com.vmcs.vendingmachine.coins;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class CoinsController {
    @Autowired
    CoinsService coinsService;

    @GetMapping(path="/coins")
    public ResponseEntity<?> listCoins(){
       List<Coins> resource = coinsService.getCoins();
       return ResponseEntity.ok(resource);
    }

    @PostMapping(path="/coins")
    public ResponseEntity<?> saveCoins(@RequestBody Coins coin){
        Coins resource = coinsService.saveCoin(coin);
        return ResponseEntity.ok(resource);
    }
}
