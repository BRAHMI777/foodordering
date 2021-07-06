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

import com.abc.simplehouse.entity.FoodCart;
import com.abc.simplehouse.service.FoodCartService;

/**
 * @author ajay naveen
 *
 */

@RestController
@RequestMapping("/cart")

public class FoodCartController {
	@Autowired
	private FoodCartService foodCartService;

	@PostMapping("/addtocart")
	public void addCart(@RequestBody FoodCart cart) {
		foodCartService.save(cart);
	}

	@GetMapping("/{id}")
	public Optional<FoodCart> fetchById(@PathVariable("id") int foodCartId) {
		Optional<FoodCart> foodcart = foodCartService.getById(foodCartId);
		return foodcart;
	}

}
