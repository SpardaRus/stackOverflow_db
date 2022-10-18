package com.example.so_db.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product_entity")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_code")
    private Integer productCode;

    @Column(name = "bare_code")
    private Integer bareCode;

    private String produce;

    private String type;

    private Integer price;

    @OneToMany
    @JoinTable(
            name="suppliers",
            joinColumns = @JoinColumn( name="product_id"),
            inverseJoinColumns = @JoinColumn( name="id")
    )
    private List<Suppliers> suppliers;
}