package com.abc.simplehouse.serviceimpl;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.simplehouse.entity.FoodItem;
import com.abc.simplehouse.exceptions.ItemAlreadyExistingException;
import com.abc.simplehouse.exceptions.ItemNotFoundException;
import com.abc.simplehouse.model.FoodItemModel;
import com.abc.simplehouse.repository.FoodItemRepository;
import com.abc.simplehouse.service.FoodItemsService;

@Service
public class FoodItemsServiceImpl implements FoodItemsService {

	@Autowired
	private FoodItemRepository foodItemsRepository;
	
	
	
	/**
     * 
     * @param item
     * @return entity
     * @date 05-Jul-2021
     */
    public FoodItem convertToEntity(FoodItemModel item) {
        FoodItem entity = new FoodItem();
        entity.setItemId(item.getItemId());
        entity.setItemName(item.getItemName());
        entity.setItemPrice(item.getItemPrice());
        entity.setItemType(item.getItemType());
        return entity;
    }
    
    /**
     * 
     * @param entity
     * @return model
     * @date 05-Jul-2021
     */
    public FoodItemModel convertToModel(FoodItem entity) {
        FoodItemModel item = new FoodItemModel();
        item.setItemId(entity.getItemId());
        item.setItemName(entity.getItemName());
        item.setItemPrice(entity.getItemPrice());
        item.setItemType(entity.getItemType());
        return item;
    }
	

	
	@Override
	public void save(FoodItemModel item) throws ItemAlreadyExistingException {
		Optional<FoodItem> op=foodItemsRepository.findById(item.getItemId());
		if(op.isPresent())
		{
			throw new ItemAlreadyExistingException("This item is already existing with Id "+item.getItemId());
		}
		else
		{
		 FoodItem foodItem=new FoodItem();
		foodItem.setItemName(item.getItemName());
		foodItem.setItemPrice(item.getItemPrice());
		foodItem.setItemType(item.getItemType());
		foodItemsRepository.save(foodItem);
		}
	}

	
	@Override
	public FoodItemModel getById(int foodItemId) throws ItemNotFoundException {
		Optional<FoodItem> foodItems= foodItemsRepository.findById(foodItemId);
		FoodItemModel foodItemModel=new FoodItemModel();
		if(foodItems.isEmpty())
		{
			throw new ItemNotFoundException("Item not found with id "+foodItemId);
		}
		else
		{
		FoodItem foodItem=new FoodItem();		
		foodItem=foodItems.get();
		foodItemModel.setItemId(foodItem.getItemId());
		foodItemModel.setItemName(foodItem.getItemName());
		foodItemModel.setItemPrice(foodItem.getItemPrice());
		foodItemModel.setItemType(foodItem.getItemType());
		
		}
		
		return foodItemModel;
	}


//	@Override
//	public FoodItemModel getByName(String foodItemName) {
//		Optional<FoodItem> foodItem= foodItemsRepository.findByFoodItemName(foodItemName);
//		FoodItemModel foodItemModel=new FoodItemModel();
//		if(foodItem.isEmpty())
//		{
//			throw new ItemNotFoundException("Item Not Found With Name "+foodItemName);
//		}
//		else
//		{
//			FoodItem foodItems=new FoodItem();		
//			foodItems=foodItem.get();
//			foodItemModel.setItemId(fi.getItemId());
//			foodItemModel.setItemName(fi.getItemName());
//			foodItemModel.setItemPrice(fi.getItemPrice());
//			foodItemModel.setItemType(fi.getItemType());
//		}
//			
//		return foodItemModel;
//	}


	@Override
	public void deleteItem(int itemId) {
		Optional<FoodItem> foodItem = foodItemsRepository.findById(itemId);
		if(foodItem.isEmpty())
		{
			throw new ItemNotFoundException("Item not found with id "+itemId);
		}
		else
		{
			foodItemsRepository.deleteById(itemId);
		}
		
	}

	@Override
	public void updateItem(int foodItemId) {
		
		Optional<FoodItem> foodItem=foodItemsRepository.findById(foodItemId);
		if(foodItem.isEmpty())
		{
			throw new ItemNotFoundException("Item not found with id "+foodItemId);
		}
		else
		{
			FoodItem foodItems=new FoodItem();		
			foodItems=foodItem.get();
			foodItems.setItemName("JUICE");
			foodItems.setItemPrice(30);
			foodItemsRepository.save(foodItems);
		}
		
		
	}

}
