package test08;

import java.util.ArrayList;
import java.util.List;

class Product {
    String name;
    int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

public class Test07 {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        Product shoe = new Product("신발", 30000);
        Product shirt = new Product("셔츠", 20000);
        Product pants = new Product("바지", 15000);

        productList.add(shoe);
        productList.add(shirt);
        productList.add(pants);

        for (Product product : productList) {
            System.out.println("상품: " + product.name + ", 가격: " + product.price);
        }
    }
}
