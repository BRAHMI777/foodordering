/**
 * 
 */
package com.abc.simplehouse.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.simplehouse.entity.FoodCart;
import com.abc.simplehouse.entity.FoodItem;
import com.abc.simplehouse.repository.FoodCartRepository;

/**
 * @author ajay naveen
 *
 */
@Service
public class FoodCartServiceImpl implements FoodCartService {
	@Autowired
	private FoodCartRepository foodCartRepository;

	@Override
	public void save(FoodCart cart) {
		foodCartRepository.save(cart);

	}

	@Override
	public Optional<FoodCart> getById(int foodCartId) {
		Optional<FoodCart> foodcart = foodCartRepository.findById(foodCartId);
		return foodcart;
	}

}
