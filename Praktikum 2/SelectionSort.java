/**
 * SelectionSort
 */
public class SelectionSort {

    static int[] selectionSort(int[] array) 
    { 
        int n = array.length; 
  
        for (int i = 0; i < n-1; i++) {
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (array[j] < array[min_idx]) 
                    min_idx = j; 
  
            int temp = array[min_idx]; 
            array[min_idx] = array[i]; 
            array[i] = temp; 
        } 
        
        return array;
    }

    public static void main(String[] args) {
        int[] array = {2, 9, 1, 5, 1, 3};
    
        for (int i = 0; i < array.length; i++) {
            System.out.println(selectionSort(array)[i]);
        }
    }
}