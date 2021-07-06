package com.abc.simplehouse.serviceimpl;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.simplehouse.controller.FoodItemController;
import com.abc.simplehouse.entity.FoodItem;
import com.abc.simplehouse.exceptions.ItemAlreadyExistingException;
import com.abc.simplehouse.exceptions.ItemNotFoundException;
import com.abc.simplehouse.model.FoodItemModel;
import com.abc.simplehouse.repository.FoodItemRepository;
import com.abc.simplehouse.service.FoodItemsService;

/**
 *
 * This class used to implement all the methods.
 * @author BrahmanandaReddy
 * 06-Jul-2021
 */
@Service
public class FoodItemsServiceImpl implements FoodItemsService {

	@Autowired
	private FoodItemRepository foodItemsRepository;
	
	private static final Logger LOGGER =LoggerFactory.getLogger(FoodItemController.class);
	
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
	

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void save(FoodItemModel item) throws ItemAlreadyExistingException {
		LOGGER.info("Save Item method is started");
		Optional<FoodItem> op=foodItemsRepository.findById(item.getItemId());
		if(op.isPresent())
		{
			LOGGER.error("ItemAlreadyExistingException is encounterd");
			throw new ItemAlreadyExistingException("This item is already existing with Id "+item.getItemId());
			
		}
		else
		{
		 FoodItem foodItem=new FoodItem();
		foodItem.setItemName(item.getItemName());
		foodItem.setItemPrice(item.getItemPrice());
		foodItem.setItemType(item.getItemType());
		foodItemsRepository.save(foodItem);
		LOGGER.info("FoodItem saved successfully");
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FoodItemModel getById(int foodItemId) throws ItemNotFoundException {
		LOGGER.info("getItemById method is started");
		Optional<FoodItem> foodItems= foodItemsRepository.findById(foodItemId);
		FoodItemModel foodItemModel=new FoodItemModel();
		if(foodItems.isEmpty())
		{
			LOGGER.error("ItemNotFoundException is encounterd");
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
		LOGGER.info("FoodItem fetched successfully");
		}
		
		return foodItemModel;
	}

	/**
	 * {@inheritDoc}
	 */
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

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void deleteItem(int itemId) {
		LOGGER.info("deleteItemById method is started");
		Optional<FoodItem> foodItem = foodItemsRepository.findById(itemId);
		if(foodItem.isEmpty())
		{
			LOGGER.error("ItemNotFoundException is encounterd");
			throw new ItemNotFoundException("Item not found with id "+itemId);
		}
		else
		{
			foodItemsRepository.deleteById(itemId);
			LOGGER.info("FoodItem deleted successfully");
		}
		
	}

	/**
	 * 
	 * {@inheritDoc}
	 */
	@Override
	public void updateItem(int foodItemId) {
		LOGGER.info("updateItem method is started");
		Optional<FoodItem> foodItem=foodItemsRepository.findById(foodItemId);
		if(foodItem.isEmpty())
		{
			LOGGER.error("ItemNotFoundException is encounterd");
			throw new ItemNotFoundException("Item not found with id "+foodItemId);
		}
		else
		{
			FoodItem foodItems=new FoodItem();		
			foodItems=foodItem.get();
			foodItems.setItemName("BIRYANI");
			foodItems.setItemPrice(130);
			foodItemsRepository.save(foodItems);
			LOGGER.info("FoodItem updated successfully");
		}
		
		
	}

	/**
	 * 
	 * {@inheritDoc}
	 */
	@Override
	public List<FoodItemModel> getAllItems() {
		LOGGER.info("ugetAllItems method is started");
		List<FoodItem> list=new ArrayList<>();
		list=foodItemsRepository.findAll();
		Iterator<FoodItem> i=list.iterator();
		while(i.hasNext())
		{
			
		}
		return null;
	}

}
