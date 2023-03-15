package mathematics;
import java.util.Scanner;

public class Baekjoon3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = {1, 1, 2, 2, 2, 8};
        int[] B = new int[6];
        
        for (int i = 0; i < B.length; i++) {
            B[i] = sc.nextInt();
        }

        sc.close();

        for (int j = 0; j < B.length; j++) {
            B[j] = A[j] - B[j];
        }

        for (int k = 0; k < B.length; k++) {
            System.out.println(B[k]);
        }
        
    }
}
