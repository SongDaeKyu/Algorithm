package mathematics;
import java.util.*;
// import java.io.*;

public class baekjoon1928 {
    // 1. 시간초과 (소수판별 함수 count사용)
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


    // 4. 출력초과 (2 3 5 7 제외 배수들 다 소수)
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

    // 5. 출력초과 (배열을 만들어봄)
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int M = sc.nextInt();
    //     int N = sc.nextInt();
    //     sc.close();
    //     boolean[] arr = new boolean[N + 1];
        
    //     for(int i = M; i<= N; i++ ) {
    //         if (i == 1) {
    //             arr[i] = false;
    //         }
    //         else if (i == 2 || i == 3 || i == 5 || i == 7) {
    //             arr[i] = true;
    //         }
    //         else if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
    //             arr[i] = false;
    //         }
    //         else {
    //             arr[i] = true;
    //         }
    //         if (arr[i] == true) {
    //             System.out.println(i);
    //         }
    //     }  
    // }

    // 6. 제곱근 이하의 자연수로 나누어떨어지면 소수 판별
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();
        sc.close();

        for (int i = M; i <= N; i++) {
            prime(i);
        }
    }

    public static void prime(int a) {
        if (a < 2) {
            return;
        }
        if (a == 2) {
            System.out.println(2);
            return;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return;
            }
        }
        System.out.println(a);
        return;
    }

    
}
