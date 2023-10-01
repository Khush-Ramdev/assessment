package com.example.assessment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
public class Product {
	@Id
	@NotBlank(message = "Product ID cannot be blank")
	String idString;
	@NotBlank(message = "Product name cannot be blank")
	String nameString;
	@Min(value = 0, message = "Price cannot be negative")
	double price;
	@Min(value = 0, message = "Quantity cannot be negative")
	int quantity;
}
