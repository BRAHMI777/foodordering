/**
 * 
 */
package com.abc.simplehouse.service;

import java.util.Optional;

import com.abc.simplehouse.entity.CartItems;
import com.abc.simplehouse.entity.FoodItem;

/**
 * @author ajay naveen
 *
 */
public interface CartItemsService {
	public void save(CartItems item);

	public Optional<CartItems> getById(int cartItemId);

}
