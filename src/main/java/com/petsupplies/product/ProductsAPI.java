package com.petsupplies.product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/petsupplies/")
public class ProductsAPI {

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private OrderConfirmationRepository orderConfirmationRepository;
	// List<Products> alist = new ArrayList<>();

	@CrossOrigin("*")
	@GetMapping("api/product")
	public List<Products> init() {
		// alist.add(new Products("Doggy","Dogs (Canis lupus familiaris) are
		// domesticated mammals, not natural wild animals",100));
		// alist.add(new Products("Cat","Domestic cats are often called house cats when
		// kept as indoor pets.",200));

		// return alist;

		return productRepository.findAll();
	}

	@PostMapping("api/product")
	public Products post(@RequestBody Products product) {
		// return product.getName() + " " + product.getDescription() + " " +
		// product.getPrice();

		// alist.add(product);
		System.out.println(product);
		productRepository.save(product);
		return product;
		// return alist;
	}

	@DeleteMapping("api/product/{id}")
	public void deleteProducts(@PathVariable String id) {
		 productRepository.deleteById(id);
		 
	}
	
	
	@PutMapping("api/product/{id}")
	public Products updateProduct(@RequestBody Products product) {
		
		return productRepository.save(product);
}
	
	@PostMapping("api/product/checkout")
	public OrderInformation returnProducts(@RequestBody OrderInformation orderinfo) {
		
		return orderConfirmationRepository.save(orderinfo);
		
	}
	
	@GetMapping("api/product/findProductByCategory={categories}")
	public void searchProductWithCategory(@RequestBody Products product) {
		
		String category = productRepository.
	}
}