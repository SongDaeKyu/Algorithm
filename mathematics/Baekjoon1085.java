package mathematics;
import java.util.*;

public class Baekjoon1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int ww = w - x;
        int hh = h - y;

        int arr[] = {x, y, ww, hh};

        Arrays.sort(arr);
        System.out.println(arr[0]);

        sc.close();
    }
}
