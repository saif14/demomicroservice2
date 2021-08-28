package com.dummy.microservice.productservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.dummy.microservice.productservice.models.Products;
import com.dummy.microservice.productservice.respositories.ProductRepositories;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/product")
//@RequiredArgsConstructor
public class ProductController {
	
	@Autowired
	private ProductRepositories prorductRepository;
	
	@GetMapping("/getAll")
	@ResponseStatus(HttpStatus.OK)
	public List<Products> getAllProducts(){
		return prorductRepository.findAll();
	}
	
	
	@PostMapping("/create")
	@ResponseStatus(HttpStatus.CREATED)
	public Products create(@RequestBody Products product) {
		System.out.println("Product is: "+product.toString());
		return prorductRepository.save(product);
	}

}
