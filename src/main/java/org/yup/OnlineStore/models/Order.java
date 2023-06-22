package org.yup.OnlineStore.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderNumber;
    private String orderDate;

    @ManyToOne
//            (targetEntity = Customer.class)
    private Customer customer;

    @ManyToMany
//            (targetEntity = Product.class)
    private List<Product> product;

    private int quantity;
    private double price;
    private String orderAddress;
    private String orderCountry;

    @ManyToOne
    private FulfillmentCenter fulfillmentCenter;




}
