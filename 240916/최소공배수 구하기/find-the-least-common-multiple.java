import java.util.*;
import java.lang.*;

public class Main {
    public static int GetCommDiv(int n, int m) {
        if(n % m == 0) {
            return m;
        }
        return GetCommDiv(m, n%m);
    }
    public static int GetCommMultiple(int n, int m) {
        int commDiv = GetCommDiv(n, m);
        return n * m / commDiv;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.print(GetCommMultiple(n, m));
    }
}