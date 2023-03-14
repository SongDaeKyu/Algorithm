package mathematics;
import java.util.Scanner;

public class Baekjoon2609 {
    // 1. a, b의 최솟값부터 1까지 a, b를 나누면서 최대공약수를 구하고 
    // 최대공약수 * a / 최대공약수 b / 최대공약수 다 곱해주면 최소공배수
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     sc.close();
    //     int maxSum = 1;
    //     int minSum = 1;
        
        
    //     for (int i = Math.min(a, b); i > 0; i--) {
    //         if (a % i == 0 && b % i == 0) {
    //             a /= i;
    //             b /= i;
    //             maxSum = i;
    //             minSum = maxSum * a * b;
    //             break;
    //         }
    //     }
    //     System.out.println(maxSum + "\n" + minSum);
    // }     

    // 2. gcd 재귀 사용 (출처: Stranger's LAB)
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     sc.close();

    //     int d = gcd(a, b);
    //     System.out.println(d);
    //     System.out.println(a * b / d);
    // }

    // public static int gcd(int a, int b) {
    //     if (b == 0) {
    //         return a;
    //     }
    //     return gcd(b, a % b);
    // }
    
    // 3. gcd 반복문 사용 (출처: Stranger's LAB)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int d = gcd(a, b);

        System.out.println(d);
        System.out.println(a * b / d);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;

            a = b;
            b = r;
        }
        return a;
    }
}