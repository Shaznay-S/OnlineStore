package org.yup.OnlineStore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yup.OnlineStore.models.Order;

public interface OrderDAO extends JpaRepository<Order, Long> {


}
