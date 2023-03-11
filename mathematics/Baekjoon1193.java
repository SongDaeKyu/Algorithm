package mathematics;
// import java.util.*;
import java.io.*;

public class Baekjoon1193 {

    // 1. 이중 for문을 돌리면서 n번째 대각선에서 n이 홀수인지 짝수인지 판별 한 뒤 
    // 짝수(왼쪽 아래로) 홀수(오른쪽 위로) a/b a++ or a--, b++ or b-- 해주면서 구했음
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int count = 0;
    //     int X = sc.nextInt();
    //     sc.close();
    //     for (int i = 1; i <= X; i++) {
    //         int a = 0;
    //         int b = 0;
    //         if (count == X ) {
    //             break;
    //         }
    //         for (int j = 1; j <= i; j++) {
    //             if (i % 2 == 0) {
    //                 if (j == 1) {
    //                    a = j;
    //                    b = i;
    //                    count++;
    //                    if (count == X ) {
    //                     System.out.println(a + "/" + b);
    //                     break;
    //                 }
    //                    continue; 
    //                 }
    //                 a++;
    //                 b--; 
    //                 count++;  
    //                 if (count == X ) {
    //                     System.out.println(a + "/" + b);
    //                     break;
    //                 }
    //             }
    //             else {
    //                 if (j == 1) {
    //                     a = i;
    //                     b = j;
    //                     count++;
    //                     if (count == X ) {
    //                         System.out.println(a + "/" + b);
    //                         break;
    //                     }
    //                     continue;
    //                 }
    //                 a--;
    //                 b++;
    //                 count++;
    //                 if (count == X ) {
    //                     System.out.println(a + "/" + b);
    //                     break;
    //                 }
    //             }
    //         }
    //     }
    // }

    // 2. X 값과 해당 범위의 대각선 칸 개수, 해당 대각선 직전 대각선 까지 대각선 칸 누적 개수를 조합하여 풀이
    // (출처: Stranger's LAB)
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int prev_count_sum = 0;
        int cross_count = 1;

        while(true) {
            if (X <= prev_count_sum + cross_count) {
                if (cross_count % 2 == 0) {
                    System.out.println((X - prev_count_sum) + "/" + (cross_count - (X - prev_count_sum - 1)));
                    break;
    
                }
                else {
                    System.out.println((cross_count - (X - prev_count_sum -1) + "/" + (X - prev_count_sum)));
                    break;
                }
                
            }
            else {
                prev_count_sum += cross_count;
                cross_count++;
            }
        }
    }
}