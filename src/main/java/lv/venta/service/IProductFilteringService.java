package lv.venta.service;

import java.util.ArrayList;

import lv.venta.model.Product;

public interface IProductFilteringService {
	public abstract ArrayList<Product> filterByQuantityThreshold(int threshold) throws Exception;
	
	public abstract ArrayList<Product> filterByPriceBetween(float minPrice, float maxPrice) throws Exception;
}
