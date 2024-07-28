package Java_FSE.week_1.Algorithms_and_Data_Structures.E_Commence_Platform_Search_Fucntion;

public class Main {
    public static void main(String[] args) {
        
        //Unsorted Array of objects
        Product[] products = new Product[5];

        products[0] = new Product(9,"Skybag","Bag");
        products[1] = new Product(3,"Iphone", "Phone");
        products[2] = new Product(10,"Pen","Stationary");
        products[3] = new Product(1,"Nike", "Shoes");
        products[4] = new Product(2,"Laptop","Electronics");

        Search search = new Search();

        int productIdToFind = 10;
        int resultIndexLinear = search.linearSearch(products, productIdToFind);
        System.out.println("\nLinear Search: Product ID " + productIdToFind + " found at index " + resultIndexLinear);

        //Sorted Array of objects
        Product[] sortedProducts = new Product[5];

        sortedProducts[0] = new Product(1,"Nike", "Shoes");
        sortedProducts[1] = new Product(2,"Laptop","Electronics");
        sortedProducts[2] = new Product(3,"Iphone", "Phone");
        sortedProducts[3] = new Product(9,"Skybag","Bag");
        sortedProducts[4] = new Product(10,"Pen","Stationary");

        productIdToFind = 2;
        resultIndexLinear = search.binarySearch(sortedProducts, productIdToFind);
        System.out.println("\nBinary Search: Product ID " + productIdToFind + " found at index " + resultIndexLinear);
    }
}
