package org.example;

public class Main {
    public static void main(String[] args) {

        int number1 = 10;
        int number2 = 20;


        Product product1 = new Product();
        product1.id = 1;
        product1.name = "Iphone 12";
        product1.unitPrice = 30000;
        product1.unitsInStock = 1;

        Product product2 = new Product();
        product2.id = 2;
        product2.name = "Iphone 13";
        product2.unitPrice = 40000;
        product2.unitsInStock = 11;

        Product product3 = new Product();
        product3.id = 3;
        product3.name = "Iphone 14";
        product3.unitPrice = 50000;
        product3.unitsInStock = 0;

        Product[] products = {product1, product2, product3};

        /*for (int i = 0; i<products.length; i++)
        {
            System.out.println(products[i].name);
        }*/


                    //alias
        for (Product product : products)
        {
            if (product.unitsInStock >= 10)
            {
                System.out.println(product.name + " Stokta fazlaca var.");
            }
            else if (product.unitsInStock < 10 && product.unitsInStock>0)
            {
                System.out.println(product.name + " Stokta az var.");
            }
            else
            {
                System.out.println(product.name + " Stokta yok.");
            }
        }
    }
}