package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Product[] osBlackBerry = new Product[]{new Product("Blackberry",90000,5),
                new Product("Blackberry 2",50000,3),
                new Product("Blackberry 3",40000,2)};

        Product[] android = new Product[]{new Product("Samsung",30000,4),
                new Product("Redmi",15000,5),
                new Product("Poco",20000,4),
                new Product("LG",32000,1),
                new Product("Realme",20000,3),
                new Product("Xiaomi",20000,2)};

        Product product1 = new Product("Iphone",60000,4);
        Product product2 = new Product("Iphone 13ProMax",100000,5);
        Product product3 =  new Product("Iphone 8",40000,3);

        Product[] iOC = new Product[]{product1,product2,product3};


        Category category1 = new Category("BlackBerryOS",osBlackBerry);
        Category category2 = new Category("Android",android);
        Category category3 = new Category("iOS",iOC);

        int temp = 0;
        for (int i = 0; i < osBlackBerry.length; i++) {
            for (int j = i+1; j < osBlackBerry.length ; j++) {
                if(osBlackBerry[i].getRating() > osBlackBerry[j].getRating()){
                    temp = osBlackBerry[i].getRating();
                    iOC[i].getRating() =iOC[j].getRating();
                    iOC[j].getRating() = temp;

                }
            }
            
        }
    }


     static Product rating(Category category1) {
        Product product = null;
         for (Product p: category1.getProducts()) {
             if (product == null){
                 product = p;
                 continue;
             }
             if (product.getRating()< p.getRating()){
                 product=p;
             }
         }
         return product;
    }
}
