package mathematics;
import java.util.*;

public class Baekjoon1193 {
    //코드 길이 줄이기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int X = sc.nextInt();
        sc.close();
        for (int i = 1; i <= X; i++) {
            int a = 0;
            int b = 0;
            if (count == X ) {
                break;
            }
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    if (j == 1) {
                       a = j;
                       b = i;
                       count++;
                       if (count == X ) {
                        System.out.println(a + "/" + b);
                        break;
                    }
                       continue; 
                    }
                    a++;
                    b--; 
                    count++;  
                    if (count == X ) {
                        System.out.println(a + "/" + b);
                        break;
                    }
                }
                else {
                    if (j == 1) {
                        a = i;
                        b = j;
                        count++;
                        if (count == X ) {
                            System.out.println(a + "/" + b);
                            break;
                        }
                        continue;
                    }
                    a--;
                    b++;
                    count++;
                    if (count == X ) {
                        System.out.println(a + "/" + b);
                        break;
                    }
                }
            }
        }
    }
}