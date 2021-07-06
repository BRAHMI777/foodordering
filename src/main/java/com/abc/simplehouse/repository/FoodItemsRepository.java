package com.abc.simplehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.abc.simplehouse.entity.FoodItem;

public interface FoodItemsRepository extends JpaRepository<FoodItem,Integer> {

}
