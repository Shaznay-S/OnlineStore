package org.yup.OnlineStore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yup.OnlineStore.dao.OrderDAO;
import org.yup.OnlineStore.dao.ProductDAO;
import org.yup.OnlineStore.models.Order;
import org.yup.OnlineStore.models.Product;

import java.util.List;

@Service
public class ProductService {

    private ProductDAO productDAO;

    @Autowired
    public ProductService(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    public List<Product> getAllProducts(){
        return this.productDAO.findAll();
    }

    public Product getProductById(Long Id){
        return this.productDAO.findById(Id).orElse(new Product());
    }

    public Product createProduct(Product product){
        return this.productDAO.save(product);
    }

    public Product updateProduct(Product product, Long Id){
        Product productToUpdate = this.productDAO.findById(Id).orElse(null);

        if(productToUpdate == null){
            return new Product();
        }

        productToUpdate.setProductName(productToUpdate.getProductName());
        productToUpdate.setSalePrice(productToUpdate.getSalePrice());
        productToUpdate.setMsrp(productToUpdate.getMsrp());
        productToUpdate.setDiscontinued(productToUpdate.isDiscontinued());
        productToUpdate.setNumberInStock(productToUpdate.getNumberInStock());
        productToUpdate.setNumberOrdered(productToUpdate.getNumberOrdered());


        return this.productDAO.save(productToUpdate);

    }

    public void deleteProduct(Long Id){
        this.productDAO.deleteById(Id);
    }
}
