package ru.neetology.JDBC.services;

import org.springframework.stereotype.Service;
import ru.neetology.JDBC.repositories.ProductRepository;


import java.util.List;


@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public String getProductName(String name) {
        List<String> list = productRepository.getProductName(name);
        return list.toString();
    }
}
