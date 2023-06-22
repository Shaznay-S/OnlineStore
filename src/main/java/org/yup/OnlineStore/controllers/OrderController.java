package org.yup.OnlineStore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.yup.OnlineStore.models.Order;
import org.yup.OnlineStore.services.OrderService;

import java.util.List;

public class OrderController {

    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }

    @GetMapping("api/order")
    public List<Order> getAllOrders(){
        return this.orderService.getAllOrders();
    }

    @PostMapping("api/order")
    @ResponseStatus(value = HttpStatus.CREATED)
    public Order creatOrder(@RequestBody Order order){
        return this.orderService.createOrder(order);
    }

    @GetMapping("api/order/{id}")
    public Order getOrderById(@PathVariable Long Id){
        return this.orderService.getOrderById(Id);
    }


    @DeleteMapping("api/order/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteOrder(@PathVariable Long Id){
        this.orderService.deleteOrder(Id);
    }

    @PutMapping("api/order/{id}")
    public Order updateOrder(@RequestBody Order order, @PathVariable Long Id){
        return this.orderService.updateOrder(order, Id);
    }
}
