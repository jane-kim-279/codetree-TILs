import java.io.*;
import java.util.*;

public class Main {
    
    static int[] A;
    static int[] B;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        A = new int[a];
        B = new int[b];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<a; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<b; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }
        
        if(isSubsequence(A, a, B, b)) System.out.println("Yes");
        else System.out.println("No");
    }

    static boolean isSubsequence(int[] A, int a, int[] B, int b) {
        if(b>a) return false;
        for(int i=0; i<=a-b; i++) {
            boolean flag = true;
            for(int j=0; j<b; j++) {
                if(A[i+j] != B[j]) {
                    flag = false;
                    break;
                }
            }
            if(flag) return flag;
        }
        return false;
    }
}