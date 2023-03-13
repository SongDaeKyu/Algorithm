package mathematics;
import java.util.*;
import java.io.*;

public class Baekjoon1085 {
    // 1. 값들을 배열로 만든 뒤 오름차순으로 정리 후  배열[0] 출력
    // public static void main(String[] args) {
        
    //     Scanner sc = new Scanner(System.in);

    //     int x = sc.nextInt();
    //     int y = sc.nextInt();
    //     int w = sc.nextInt();
    //     int h = sc.nextInt();

    //     int arr[] = {x, y, w-x, h-y};

    //     Arrays.sort(arr);
    //     System.out.println(arr[0]);

    //     sc.close();
    // }

    // 2. Math.min() 을 이용하여 x의 최솟값 y의 최솟값 -> x 최솟값 y 최솟값 의 최솟값 (출처: Stranger's LAB)
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int x = sc.nextInt();
    //     int y = sc.nextInt();
    //     int w = sc.nextInt();
    //     int h = sc.nextInt();

    //     sc.close();

    //     int x_min = Math.min(x, w - x);
    //     int y_min = Math.min(y, h - y);

    //     System.out.println(Math.min(x_min, y_min));

    // }

    // 3. 2번을 BufferedReader, StringTokenizer 사용 
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int x_min = Math.min(x, w - x);
        int y_min = Math.min(y, h - y);

        System.out.println(Math.min(x_min, y_min));
    }
}
