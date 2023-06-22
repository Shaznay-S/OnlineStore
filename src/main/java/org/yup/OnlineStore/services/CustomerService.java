package org.yup.OnlineStore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yup.OnlineStore.dao.CustomerDAO;
import org.yup.OnlineStore.models.Customer;

import java.util.List;

@Service
public class CustomerService {

    private CustomerDAO customerDAO;

    @Autowired
    public CustomerService(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    public List<Customer> getAllCustomers() {
        return this.customerDAO.findAll();
    }

    public Customer getCustomerById(Long Id) {
        return this.customerDAO.findById(Id).orElse(new Customer());
    }

//    public boolean authenticateCustomer(String email, String password) {
//
//        Customer customer = customerDAO.findCustomerByEMail(email);
//
//        if (customer != null && customer.getPassword().equals(password)) {
//            return true;
//
//        }
//
//        return false;
//
//    }

    public Customer createCustomer(Customer customer){
        return this.customerDAO.save(customer);
    }

    public Customer getCustomerByName(String name){
        return this.customerDAO.getCustomerByName(name);
    }

    public void deleteCustomer(Long Id){
        this.customerDAO.deleteById(Id);
    }

    public Customer updateCustomer(Customer customer, Long Id){

        Customer customerToUpdate = this.customerDAO.findById(Id).orElse(null);

        if(customerToUpdate == null){
            return new Customer();
        }

        customerToUpdate.setName(customer.getName());
        customerToUpdate.setPaymentNumber(customer.getPaymentNumber());
        customerToUpdate.setEMail(customer.getEMail());
        customerToUpdate.setPassword(customer.getPassword());

        return this.customerDAO.save(customerToUpdate);
    }
}
