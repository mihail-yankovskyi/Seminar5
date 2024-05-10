package lv.venta;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import lv.venta.model.Product;
import lv.venta.repo.IProductRepo;

@SpringBootApplication
public class Seminar5Application {

	public static void main(String[] args) {
		SpringApplication.run(Seminar5Application.class, args);
	}
	
	//@Bean
	public CommandLineRunner testDatabase(IProductRepo productRepo) {
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				Product p1 = new Product("Apple", "Red", 0.99f, 5);
				Product p2 = new Product("Tomato", "Red", 1.33f, 9);
				Product p3 = new Product("Watermelon", "Pink", 2.99f, 3);
				productRepo.save(p1);
				productRepo.save(p2);
				productRepo.save(p3);
				
				System.out.println("How Many: " + productRepo.count());
				
				System.out.println("All Products: " + productRepo.findAll());
				
				System.out.println("Find by id " + productRepo.findById(2).get());
				
			}
		};
		
		
		
	}
	

}