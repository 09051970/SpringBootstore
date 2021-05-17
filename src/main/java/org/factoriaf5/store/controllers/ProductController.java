package org.factoriaf5.store.controllers;

import org.factoriaf5.store.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class ProductController {
    @GetMapping("/health")
    public String check () { return "Hello I´m a server"; }

   public List<Product> products = new ArrayList<>();


   @GetMapping('/products')
    public List<Product> allProducts () {
       return products;
   }
}


