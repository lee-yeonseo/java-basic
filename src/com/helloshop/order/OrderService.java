package com.helloshop.order;

import com.helloshop.prduct.Product;
import com.helloshop.user.User;

public class OrderService {

    public void order() {
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}
