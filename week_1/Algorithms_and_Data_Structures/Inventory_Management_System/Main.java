package Java_FSE.week_1.Algorithms_and_Data_Structures.Inventory_Management_System;

public class Main {
    
    public static void main(String[] args) {
        
        Inventory I = new Inventory();

        Product p1 = new Product(1,"Iphone",1,80000);
        Product p2 = new Product(2, "Redmi", 2, 250000);

        I.addProduct(p1);
        

        //Prints details of p1
        I.printProductDetails(1);
        System.out.println();

        I.addProduct(p2);
        
        //Prints details of p2
        I.printProductDetails(2);
        System.out.println();

        //Deleting product with ID 2
        I.deleteProduct(2);

        //Product doesn't exist
        I.printProductDetails(2);

    }
}
