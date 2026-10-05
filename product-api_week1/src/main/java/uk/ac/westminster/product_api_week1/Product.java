package uk.ac.westminster.product_api_week1;

public class Product {

     public Long id;
     public String name;
     public double price;

     public Product (Long id, String name, double price) {
         this.id = id;
         this.name = name;
         this.price = price;
     }

}
