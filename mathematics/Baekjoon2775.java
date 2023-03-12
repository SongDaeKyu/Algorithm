package mathematics;
import java.util.*;

public class Baekjoon2775 {
    // 1. X (asum 과 sum을 조합하여 규칙찾기)
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int T = sc.nextInt();
    //     int sum = 0;
    //     int asum = 0;

    //     for (int i = 0; i < T; i++) {
    //         int k = sc.nextInt();
    //         int n = sc.nextInt();
            
    //         for (int j = 1; j <= n; j++) {
    //             sum += asum;
    //             for (int r = 1; r <= j; r++) {
    //                 sum += r; 
    //                 asum += r;
    //             }
    //         }
    //     }
    //     sc.close();
    //     System.out.println(sum);
    // }

    // 2. 2차원 배열 만들기 (출처: Stranger's LAB)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[15][15];
        
        for (int i = 0; i < 15; i++) {
            arr[0][i] = i;
            arr[i][1] = 1;
        }

        for (int i = 1; i < 15; i++) {
            for (int j = 2; j < 15; j++) {
                arr[i][j] = arr[i-1][j] + arr[i][j-1];
            }
        }

        int T  = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(arr[k][n]);
        }
        sc.close();
    }
}
