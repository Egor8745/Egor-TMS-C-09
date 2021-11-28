package com.home.shop.realization;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Shop {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        if (checkId(product.getId())) {
            products.add(product);
        }
    }

    private boolean checkId(int id) {
        if (!(products == null)) {
            return products.stream().noneMatch(product -> product.getId() == id);
        } else {
            return true;
        }
    }

    public String returnAllProduct() {
        return products.toString();
    }

    public void deleteProduct(Product prd) {
        products.removeIf(product -> product.getId() == prd.getId());
    }

    @Override
    public String toString() {
        return "Shop{" +
                "products=" + products +
                '}';
    }
}
