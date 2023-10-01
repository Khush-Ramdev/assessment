package com.example.assessment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.assessment.entity.Product;
import com.example.assessment.repository.ProductRepository;

@RestController
public class ProductController {

	@Autowired
	private ProductRepository productRepository;

	@GetMapping("/productsinrange")
	public List<Product> getProductsByPriceRange(@RequestParam double minPrice, @RequestParam double maxPrice) {
		System.out.println(minPrice);
		return productRepository.findProductsByPriceBetween(minPrice, maxPrice);
	}
}
