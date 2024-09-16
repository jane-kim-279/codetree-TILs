import java.util.*;
import java.lang.Math;

public class Main {
    public static int GetCommDiv(int n, int m) {
        int i = Math.min(n, m);
        while(true) {
            if(n % i == 0 && m % i == 0) {
                return i;
            } else {
                i--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.print(GetCommDiv(n, m));
    }
}