package org.yup.OnlineStore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yup.OnlineStore.dao.EmployeeDAO;
import org.yup.OnlineStore.dao.OrderDAO;
import org.yup.OnlineStore.models.Employee;
import org.yup.OnlineStore.models.Order;

import java.util.List;

@Service
public class OrderService {

    private OrderDAO orderDAO;

    @Autowired
    public OrderService(OrderDAO orderDAO) {
        this.orderDAO = orderDAO;
    }

    public List<Order> getAllOrders(){
        return this.orderDAO.findAll();
    }

    public Order getOrderById(Long Id){
        return this.orderDAO.findById(Id).orElse(new Order());
    }

    public Order createOrder(Order order){
        return this.orderDAO.save(order);
    }

    public Order updateOrder(Order order, Long Id){
        Order orderToUpdate = this.orderDAO.findById(Id).orElse(null);

        if(orderToUpdate == null){
            return new Order();
        }

        orderToUpdate.setOrderAddress(orderToUpdate.getOrderAddress());
        orderToUpdate.setOrderCountry(orderToUpdate.getOrderCountry());
        orderToUpdate.setFulfillmentCenter(orderToUpdate.getFulfillmentCenter());
        orderToUpdate.setProduct(orderToUpdate.getProduct());

        return this.orderDAO.save(orderToUpdate);

    }

    public void deleteOrder(Long Id){
        this.orderDAO.deleteById(Id);
    }
}
