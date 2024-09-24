import java.io.*;
import java.util.*;

public class Main {
    
    static int[] A;
    static int[] B;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());

        A = new int[n1];
        B = new int[n2];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n1; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n2; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }
        
        if(checkArr(A, B)) System.out.println("Yes");
        else System.out.println("No");
    }

    static boolean checkArr(int[] A, int[] B) {
        boolean flag = false;
        for(int i=0; i<A.length; i++) {
            if(A[i] == B[0]) {
                for(int j=0; j<B.length; j++) {
                    if(A[i+j] == B[j]) {
                        flag = true;
                    } else flag = false;
                }
                return flag;
            }
        }
        return flag;
    }
}