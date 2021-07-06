/**
 * 
 */
package com.abc.simplehouse.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.simplehouse.entity.CartItems;
import com.abc.simplehouse.repository.CartItemsRepository;

/**
 * @author ajay naveen
 *
 */
@Service

public class CartItemsServiceImpl implements CartItemsService {

	@Autowired
	private CartItemsRepository cartItemsRepository;

	@Override
	public void save(CartItems item) {
		cartItemsRepository.save(item);

	}

	@Override
	public Optional<CartItems> getById(int cartItemId) {
		Optional<CartItems> cartItems = cartItemsRepository.findById(cartItemId);
		return cartItems;
	}

}
