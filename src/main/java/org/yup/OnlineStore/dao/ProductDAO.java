package org.yup.OnlineStore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yup.OnlineStore.models.Product;

public interface ProductDAO extends JpaRepository<Product, Long> {

}
