package lv.venta.repo;

import org.springframework.data.repository.CrudRepository;

import lv.venta.model.Product;

public interface IProductRepo extends CrudRepository<Product, Integer>{

	//public abstract by default because this function is in interface
	Product findByTitleAndDescriptionAndPrice(String title, String description, float price);

	

}