import java.util.*;
class Solution {
    public int solution(String my_string) {
        
        my_string = my_string.replaceAll("[a-zA-Z]","");
        System.out.println(my_string);
        int[] temp = new int[my_string.length()];
        int result = 0;
        for (int i = 0; i < my_string.length(); i++) {
            temp[i] = my_string.charAt(i)-'0';
        }
        System.out.println(Arrays.toString(temp));
        for (int j : temp) {
            result += j;
        }
        int answer = result;
        return answer;
    }
}