package mathematics;
import java.util.*;
import java.io.*;

public class Baekjoon10250 {
    public static void main(String[] args) throws IOException{
    //     #first solve    
    //     Scanner sc = new Scanner(System.in);
        
    //     int T = sc.nextInt();
    //     int H = 0;
    //     int W = 0;
    //     int N = 0;
        
    //     for (int i = 0; i < T; i++) {
    //         int h_count = 0;
    //         int w_count = 1;
    //         H = sc.nextInt();
    //         W = sc.nextInt();
    //         N = sc.nextInt();
            
    //         for (int j = 0; j < N; j++) {
    //             if (h_count <= H) {
    //                 h_count++;
    //                 if (h_count > H) {
    //                     h_count = 1;
    //                     w_count += 1;
    //                 }
    //             }
    //         }
    //         System.out.println(h_count * 100 + w_count);
    //     }
    //     sc.close();

        // second solve
        // Scanner sc = new Scanner(System.in);

        // int T = sc.nextInt();
        // int H = 0;
        // int W = 0;
        // int N = 0;

        // for (int i = 0; i < T; i++) {
        //     H = sc.nextInt();
        //     W = sc.nextInt();
        //     N = sc.nextInt();

        //     if(N % H == 0) {
        //         System.out.println(H * 100 + N / H);
        //     }
        //     else {
        //         System.out.println(N % H * 100 + (N / H + 1));
        //     }
        // }
        // sc.close();

        //third solve
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
            
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int H = Integer.parseInt(st.nextToken());
            st.nextToken();
            int N = Integer.parseInt(st.nextToken());

            if(N % H == 0) {
                System.out.println(H * 100 + N / H);
            }
            else {
                System.out.println(N % H * 100 + (N / H + 1));
            }
        }
    }
}