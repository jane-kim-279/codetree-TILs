import java.util.*;

public class Main {
    public static boolean hasMultiple(int num) {
        while(num>0) {
            if(num % 10 == 3 || num % 10 == 6 || num % 10 == 9) {
                return true;
            } else {
                num /= 10;
            }
        }
        return false;
    }

    public static boolean isMultiple(int num) {
        if(num % 3 == 0) return true;
        return false;
    }

    public static int countNum(int a, int b) {
        int cnt = 0;
        for(int i=a; i<=b; i++) {
            if(hasMultiple(i) || isMultiple(i)) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(countNum(a, b));
    }
}