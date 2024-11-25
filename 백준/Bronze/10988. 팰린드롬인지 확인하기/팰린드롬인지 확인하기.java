import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        
        // StringBuilder stringBuilder = new StringBuilder();
        
        
        Scanner scanner = new Scanner(System.in);
        // System.out.println("문자를 입력하세요 :");
        String a = scanner.next();
        
        char[] temp = new char[a.length()];
        for (int i = 0; i < a.length(); i++) {
            temp[i] = a.charAt(i);    
        }
        
        // System.out.println(Arrays.toString(temp));
        // System.out.println(a.length());
        int ispalen = 1;
        for (int j = 0; j <= (a.length()/2); j++) {
            if ( temp[j] != temp[a.length()-j-1]) {
                ispalen = 0;
            }
        }
        System.out.println(ispalen);
    }
}