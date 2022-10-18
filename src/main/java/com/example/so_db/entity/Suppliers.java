package com.example.so_db.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "suppliers")
@Data
public class Suppliers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String company;

    private Long inn;

    @Column(name = "product_id")
    private Long productId;

}