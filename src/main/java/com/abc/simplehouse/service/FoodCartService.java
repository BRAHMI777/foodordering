/**
 * 
 */
package com.abc.simplehouse.service;

import java.util.Optional;

import com.abc.simplehouse.entity.FoodCart;

/**
 * @author ajay naveen
 *
 */
public interface FoodCartService {
	public void save(FoodCart cart);

	public Optional<FoodCart> getById(int foodCartId);

}
