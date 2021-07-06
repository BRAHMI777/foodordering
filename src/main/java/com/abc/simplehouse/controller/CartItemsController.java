/**
 * 
 */
package com.abc.simplehouse.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.simplehouse.entity.CartItems;
import com.abc.simplehouse.service.CartItemsService;

/**
 * @author ajay naveen
 *
 */

@RestController
@RequestMapping("/cartitems")
public class CartItemsController {

	@Autowired
	private CartItemsService cartItemsService;

	@PostMapping("/additemtocart")
	public void addItem(@RequestBody CartItems item) {
		cartItemsService.save(item);
	}

	@GetMapping("/{id}")
	public Optional<CartItems> fetchById(@PathVariable("id") int cartId) {
		Optional<CartItems> cartItems = cartItemsService.getById(cartId);
		return cartItems;

	}

}
