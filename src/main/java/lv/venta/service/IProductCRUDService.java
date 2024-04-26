package lv.venta.service;

import java.util.ArrayList;

import lv.venta.model.Product;

public interface IProductCRUDService {
	
	//CRUD - create- retrieve - update - delete
	//create
	public abstract void create(String title, String description, float price, int quantity) throws Exception;
	
	//retrieve all
	public abstract ArrayList<Product> retrieveAll() throws Exception;
	
	//retrieve by id
	public abstract Product retrieveById(int id) throws Exception;
	
	//update
	public abstract void updateById(int id, String title, String description, float price, int quantity) throws Exception;
	
	//delete
	public abstract void deleteById(int id) throws Exception;
	

}