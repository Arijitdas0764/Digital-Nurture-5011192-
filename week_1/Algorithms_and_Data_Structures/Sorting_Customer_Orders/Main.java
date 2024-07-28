package Java_FSE.week_1.Algorithms_and_Data_Structures.Sorting_Customer_Orders;

public class Main {
    public static void main(String[] args) {
        
        Order[] order = new Order[5];

        order[0] = new Order(1,"Customer 1",65.6);
        order[1] = new Order(2,"Customer 2",5.6);
        order[2] = new Order(3,"Customer 3",6.6);
        order[3] = new Order(4,"Customer 4",10.5);
        order[4] = new Order(5,"Customer 5",100.7);

        Sort.bubbleSort(order);

        Sort.quickSort(order, 0, 4);

        //printing sorted Customer details according to total price
        for(Order ord : order){
            System.out.println("Order ID: " + ord.getOrderId() + "; Customer Name: " + ord.getCustomerName() + "; Total Price: " + ord.getTotalPrice());
        }
    }
}
