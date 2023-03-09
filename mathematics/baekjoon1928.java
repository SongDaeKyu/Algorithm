package mathematics;
import java.util.*;
import java.io.*;

public class baekjoon1928 {
    // 1. 시간초과 (소수판별 함수)
    // public static boolean primeNum(int a) {
    //     int count = 0;
    //     if (a == 1) {
    //         return false;
    //     }
    //     for (int j = 1; j <= a; j++) {
    //         if(a % j == 0) {
    //             count++;
    //         }
    //     }
    //     if (count == 2) {
    //         return true;
    //     }
    //     else {
    //         return false;
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int M = sc.nextInt();
    //     int N = sc.nextInt();
    //     sc.close();

    //     for(int i = M; i <= N; i++) {
    //         if (primeNum(i) == true) {
    //             System.out.println(i);
    //         }
    //     }
    // }


    // 2. 시간초과 (이중 for문으로 소수판별)
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int M = sc.nextInt();
    //     int N = sc.nextInt();
    //     sc.close();

    //     for(int i = M; i <= N; i++) {
    //         int count = 0;
    //         for (int j = 1; j <= i; j++) {
    //             if (i % j == 0) {
    //                 count++;
    //             }
    //         }
    //         if (i != 1 && count == 2) {
    //             System.out.println(i);
    //         }
    //     }
    // }

    // 3. 시간초과 (BufferedReader로 만들어도 시간초과)
    // public static boolean primeNum(int a) {
    //     if (a == 1) {
    //         return false;
    //     }
    //     int count = 0;
    //     for (int k = 1; k <= a; k++) {
    //         if (a % k == 0) {
    //             count++;
    //         }
    //     }
    //     if (count == 2) {
    //         return true;
    //     }
    //     else {
    //         return false;
    //     }
    // }
    // public static void main(String[] args) throws IOException {
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //     StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    //     int M = Integer.parseInt(st.nextToken());
    //     int N = Integer.parseInt(st.nextToken());

    //     for (int l = M; l<= N; l++) {
    //         if (primeNum(l) == true) {
    //             System.out.println(l);
    //         }
    //     }
    // }


    // 4. 출력초과
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int M = sc.nextInt();
    //     int N = sc.nextInt();
    //     sc.close();
    //     for (int i = M; i <= N; i++) {
    //         if (i == 2 || i == 3 || i == 5 || i == 7) {
    //             System.out.println(i);
    //         }
    //         else if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
    //             System.out.println(i);
    //         }
    //     }
    // }
}
