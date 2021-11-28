package com.home.shop;

import com.home.shop.realization.Product;
import com.home.shop.realization.Shop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Product product1 = new Product(1, "мясо", 19);
        Product product2 = new Product(2, "помидоры", 5);
        Product product3 = new Product(3, "корм для кошек", 25);
        Product product4 = new Product(4, "рыба", 15);

        shop.addProduct(product1);
        shop.addProduct(product2);
        shop.addProduct(product3);
        shop.addProduct(product4);
        shop.getProducts().sort(Comparator.comparing(Product::getPrice));
        System.out.println(shop.returnAllProduct());
        shop.deleteProduct(product1);
        System.out.println(shop.returnAllProduct());
        shop.getProducts().sort(Comparator.comparingInt(Product::getId));// понимаю,что по индексу нужно. Переделаю.
        System.out.println(shop.returnAllProduct());
    }
}