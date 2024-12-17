package com.example.ecommerce.order;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "\"order\"")
public class Order {
    @Id
    @GeneratedValue
    private Long id;
    private String description;

    // Getters and setters
}