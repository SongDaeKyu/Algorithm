package mathematics;
import java.util.*;
import java.io.*;

public class Baekjoon3003 {
    // 1
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int[] A = {1, 1, 2, 2, 2, 8};
    //     int[] B = new int[6];
        
    //     for (int i = 0; i < B.length; i++) {
    //         B[i] = sc.nextInt();
    //     }

    //     sc.close();

    //     for (int j = 0; j < B.length; j++) {
    //         B[j] = A[j] - B[j];
    //     }

    //     for (int k = 0; k < B.length; k++) {
    //         System.out.println(B[k]);
    //     }
    // }

    // 2. 한 줄로 출력하기 위해 print 사용 (출처: Stranger's LAB)
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int king = 1;
        int queen = 1;
        int rook = 2;
        int bishop = 2;
        int knight = 2;
        int pawn = 8;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        king = king - Integer.parseInt(st.nextToken());
        queen = queen - Integer.parseInt(st.nextToken());
        rook = rook - Integer.parseInt(st.nextToken());
        bishop = bishop - Integer.parseInt(st.nextToken());
        knight = knight - Integer.parseInt(st.nextToken());
        pawn = pawn - Integer.parseInt(st.nextToken());
    
        System.out.print(king + " ");
        System.out.print(queen + " ");
        System.out.print(rook + " ");
        System.out.print(bishop + " ");
        System.out.print(knight + " ");
        System.out.print(pawn + " ");
    }
}
