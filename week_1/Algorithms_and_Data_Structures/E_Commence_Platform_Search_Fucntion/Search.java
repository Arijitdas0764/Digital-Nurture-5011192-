package Java_FSE.week_1.Algorithms_and_Data_Structures.E_Commence_Platform_Search_Fucntion;

public class Search {
    
    //Linear Search on array of objects
    public int linearSearch(Product[] arr, int productId){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getProductId() == productId) {
                return i;
            }
        }
        return -1;// if not found
    }

    //Binary Search on sorted array of objects
    public int binarySearch(Product[] arr, int productId){

        int low = 0;
        int high = arr.length-1;

        while(low<=high){
            int mid = low + (high - low)/2;

            if(productId == arr[mid].getProductId())
                return mid;
            else if(productId < arr[mid].getProductId())
                high = mid - 1;
            else
                low = mid + 1;
        }

        return -1;// if not found
    }
}
