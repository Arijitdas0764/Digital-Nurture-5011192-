package Java_FSE.week_1.Algorithms_and_Data_Structures.Sorting_Customer_Orders;

public class Sort {
    
    // Bubble Sort
    public static void bubbleSort(Order[] orders) {
        int n = orders.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (orders[j].getTotalPrice() > orders[j + 1].getTotalPrice()) {
                    swap(orders, j, j + 1);
                }
            }
        }
    }

    // Quick Sort
    public static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(orders, low, high);
            quickSort(orders, low, pivotIndex - 1);
            quickSort(orders, pivotIndex + 1, high);
        }
    }

    private static int partition(Order[] orders, int low, int high) {
        Order pivot = orders[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (orders[j].getTotalPrice() < pivot.getTotalPrice()) {
                i++;
                swap(orders, i, j);
            }
        }

        swap(orders, i + 1, high);
        return i + 1;
    }

    private static void swap(Order[] orders, int i, int j) {
        Order temp = orders[i];
        orders[i] = orders[j];
        orders[j] = temp;
    }
}
