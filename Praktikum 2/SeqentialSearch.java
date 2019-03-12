/**
 * SeqentialSearch
 */
public class SeqentialSearch {

    static boolean sequentialSearch(boolean found, int[] array, int key) {
        int i = 0;
        while (i < array.length && !found) {
            if (array[i] == key) {
                found = true;
            } else {
                i += 1;
            }
        }
        return found;
    }

    public static void main(String[] args) {
        int key = 5;
        boolean found = false;
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        // System.out.print(sequentialSearch(i, found, array, key));
        if (sequentialSearch(found, array, key)) {
            System.out.print(key + " ditemukan");
        } else {
            System.out.print("tidak ditemukan");
        }
    }
}