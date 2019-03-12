/**
 * InsertionSort
 */
public class InsertionSort {

    static int[] insertionSort(int[] array) 
    {  
        for (int i = 1; i < array.length; ++i) { 
            int key = array[i]; 
            int j = i - 1; 
  
            while (j >= 0 && array[j] > key) { 
                array[j + 1] = array[j]; 
                j = j - 1; 
            } 
            array[j + 1] = key; 
        }

        return array;
    } 

    public static void main(String[] args) {
        int[] array = {2, 9, 1, 5, 1, 3};
    
        for (int i = 0; i < array.length; i++) {
            System.out.println(insertionSort(array)[i]);
        }
    }
}