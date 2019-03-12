/**
 * NilaiMaksimal
 */
public class NilaiMaksimal {
    
    static int cariNilaiMaks(int[] x) {
        int max = x[0];
        for (int i = 0; i < x.length; i++) {
            if (x[i] > max) {
                max = x[i];
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        int[] x = {1,7,0,1,5};
        System.out.print(cariNilaiMaks(x));
    }
}