import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int mon = sc.nextInt();
        int day = sc.nextInt();

        if(checkDate(year, mon, day)) {
            System.out.println(getSeason(mon));
        } else {
            System.out.println("-1");
        }
    }

    static boolean isLeapYear(int year) {
        if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) return true;
        else return false;
    }

    static boolean checkDate(int year, int mon, int day) {
        if(isLeapYear(year)) {
            if(mon == 2) {
                if(1<=day && day<=29) return true;
                else return false;
            } else if(mon == 4 || mon == 6 || mon == 9 || mon == 11) {
                if(1<=day && day<=30) return true;
                else return false;                
            } else {
                if(1<=day && day<=31) return true;
                else return false;
            }
        } else {
            if(mon == 2) {
                if(1<=day && day<=28) return true;
                else return false;
            } else if(mon == 4 || mon == 6 || mon == 9 || mon == 11) {
                if(1<=day && day<=30) return true;
                else return false;                
            } else {
                if(1<=day && day<=31) return true;
                else return false;
            }
        }
    }

    static String getSeason(int mon) {
        if(3<= mon && mon <= 5) return "Spring";
        else if(6<= mon && mon<=8) return "Summer";
        else if (9<=mon && mon<=11) return "Fall";
        else return "Winter";
    }
}