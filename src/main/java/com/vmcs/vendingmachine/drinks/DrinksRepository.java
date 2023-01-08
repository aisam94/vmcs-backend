package com.vmcs.vendingmachine.drinks;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@Repository
@RepositoryRestResource
public interface DrinksRepository extends JpaRepository<Drinks, Integer> {
}
