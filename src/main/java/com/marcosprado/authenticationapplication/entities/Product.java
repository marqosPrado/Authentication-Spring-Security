package com.marcosprado.authenticationapplication.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String productId;

    @Column(length = 200, nullable = false)
    private String description;

    @Column(nullable = false)
    private Double price;

}
