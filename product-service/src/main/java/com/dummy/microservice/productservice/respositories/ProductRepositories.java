package com.dummy.microservice.productservice.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dummy.microservice.productservice.models.Products;

public interface ProductRepositories extends JpaRepository<Products, Long>  {
	
	

}
