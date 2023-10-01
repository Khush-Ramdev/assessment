package com.example.assessment.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.assessment.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {

	@Query("SELECT * FROM product p WHERE p.price > :price")
	List<Product> findProductsByPriceGreaterThan(double price);

	@Query("SELECT * FROM product WHERE price > :minPrice && price < :maxPrice")
	List<Product> findProductsByPriceBetween(double minPrice, double maxPrice);

}
