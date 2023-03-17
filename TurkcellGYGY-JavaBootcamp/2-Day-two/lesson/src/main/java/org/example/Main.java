package org.example;

public class Main {
    public static void main(String[] args) {
        //bir nesneyi parametreli constructor'da oluşturmanın avantajı fieldlara null atanmaz.
        //eğer parametresiz constructor ile nesneyi oluşturursak fieldların başlangıç değeri null olur.
        Product product1 = new Product(1, "iphone 15", 35000, 10);
        Product product2 = new Product(2, "galaxy s21", 20000, 10);
        Product product3 = new Product(3, "ps5", 15000, 15);


        Product[] products = {product1, product2, product3};

        for (Product product : products)
        {
            System.out.println(product.getName() + ": " + product.getUnitPrice() + " -> " + product.getUnitPriceAfterDiscount());
        }
    }
}