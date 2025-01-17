package com.pontoFood.orders.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String customerName;
    private String customerAddress;
    private String status;

    @OneToMany
    private List<MenuItem> items;

}
