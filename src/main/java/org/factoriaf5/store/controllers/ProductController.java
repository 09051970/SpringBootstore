package org.factoriaf5.store.controllers;

import org.factoriaf5.store.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;


@RestController
public class ProductController {
    @GetMapping("/health")
    public String check () { return "Hello I´m a server"; }

    public List<Product> products = new ArrayList<>();

    @GetMapping("/products")
    public ArrayList<Product> allProducts () {
       return products;
   }

   @PostMapping("/products")
    public RedirectView addNewProduct(Product product){
        products.add(product);
        return new RedirectView("/products");
   }

}


