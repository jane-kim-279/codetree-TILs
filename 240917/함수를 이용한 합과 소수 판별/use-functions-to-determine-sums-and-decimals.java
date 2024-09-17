import java.util.*;

public class Main {
    public static boolean isPrime(int num) {
        if(num == 1) return false;
        for(int i=2; i<num; i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
    public static int addAll(int num) {
        int result = 0;
        while(num>0) {
            result += num % 10;
            num /= 10;
        }
        return result;
    }
    public static boolean isNum(int num) {
        int result = addAll(num);
        if(isPrime(num) && result % 2 == 0) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        for(int i=a; i<=b; i++) {
            if(isNum(i)) cnt++; 
        }
        System.out.print(cnt);
    }
}