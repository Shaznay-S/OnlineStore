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
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    private String name;

    @OneToMany(mappedBy = "customer")
    private List<Order> orders;

    private String eMail;
    private String password;
    private String paymentNumber;
}
