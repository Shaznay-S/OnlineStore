package org.yup.OnlineStore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yup.OnlineStore.models.Customer;

public interface CustomerDAO extends JpaRepository<Customer, Long> {

    public Customer getCustomerByName(String name);

//    public Customer findCustomerByEMail(String eMail);

}
