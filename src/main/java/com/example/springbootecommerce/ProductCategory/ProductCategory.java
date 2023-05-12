package com.example.springbootecommerce.ProductCategory;

import com.example.springbootecommerce.Product.Product;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "product_category")
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private String id;

    @Column(name="category_name")
    private String categoryName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private Set<Product> products;
}
