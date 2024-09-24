import java.io.*;
import java.util.*;

public class Main {
    
    static String[] longM = {"1", "3", "5", "7", "8", "10", "12"};
    static String[] shortM = {"4", "6", "9", "11"};

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String M = Integer.toString(sc.nextInt());
        int D = sc.nextInt();
        
        if(checkDate(M, D)) System.out.println("Yes");
        else System.out.println("No");
    }

    static boolean checkDate(String M, int D) {
        boolean flag = false;
        if(Arrays.asList(longM).contains(M)) {
            if(1 <= D && D <= 31) flag = true; 
        } else if(Arrays.asList(shortM).contains(M)) {
            if(1<=D && D<=30) flag = true;
        } else {
            if(1<=D && D<=28) flag = true;
        }
        return flag;
    }
}