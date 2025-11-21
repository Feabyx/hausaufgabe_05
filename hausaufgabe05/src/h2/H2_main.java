package h2;

public class H2_main {
    public static void main(String[] args) {

        int n = 299;        
        int digits = 0;
        int[] a = new int[9];

        if (n == 0) {
            digits = 1;
        } else {
            for (int t = n; t > 0; t /= 10) {
                digits++;
            }
        }
        int j = n;       
        for (int i = 8; i >= 9 - digits; i--) {
            a[i] = j % 10;   
            j /= 10;        
        }
       }
    }

