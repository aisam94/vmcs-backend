package com.vmcs.vendingmachine.coins;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CoinsRepository extends JpaRepository<Coins, Integer> {
}
