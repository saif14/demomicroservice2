package com.dummy.microservice.productservice.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
@Entity
@Table(name = "products")
@ToString
public class Products {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private String price;

}
