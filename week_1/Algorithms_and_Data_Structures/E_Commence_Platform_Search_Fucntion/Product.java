package Java_FSE.week_1.Algorithms_and_Data_Structures.E_Commence_Platform_Search_Fucntion;

public class Product {
    
    private int productId;
    private String productName;
    private String category;

    //Constructor
    Product(int productId, String productName, String category){
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    //Getters
    public int getProductId(){
        return productId;
    }

    public String getProductName(){
        return productName;
    } 

    public String getCategory(){
        return category;
    }

    //Setters
    public void setProductId(int productId){
        this.productId = productId;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public void setCategory(String category){
        this.category = category;
    }
}
