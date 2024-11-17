import java.util.Arrays;

public class HeapSort {
    public static void heapSort(Integer[] values) {
        int n = values.length  ;
        for(int i = n/2-1; i >=0; i--){
           
            heapify(values, 1, i -1);

        }
        for(int i = n-1; i> 0; i--){
            exchange(values, 0, i);
            heapify(values, 0, i);
        }
    }
    public static void heapify(Integer[] values, int i, int n){
        int min =i;
        int left = 2 *i +1;
        int right = 2 * i +2;
        if(left < n && values[left] < values[min]){
            min = left;
        }
        if(right < n && values[right] < values[min]){
            min = right;
        }if(min != i){
            exchange(values, i , min);
            heapify(values, min, n);
        }
    }
    private static void exchange(Integer[] values, int i, int j){
        int temp = values[i];
        values[i] = values[j];
        values[j] = temp;
    }

    public static void main(String[] args) {
        int size = 20;
        Integer[] list = new Integer[size];

        for (int i = 0; i < list.length; i++) {
            list[i] = i;
        }

        System.out.println("Unsorted List: " + Arrays.toString(list));
        heapSort(list);
        System.out.println("  Sorted List:" + Arrays.toString(list));
    }
}
