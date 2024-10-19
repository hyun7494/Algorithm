import java.util.*;
class Solution {
    public String solution(String my_string) {
        
        char[] result = new char[my_string.length()];
        
        for (int i = 0; i<my_string.length()/2; i++) {
            char temp = my_string.charAt(i);
            result[i] = my_string.charAt(my_string.length()-1-i);
            result[my_string.length()-1-i] = temp;
            if(my_string.length() % 2 == 1) {
                result[my_string.length() / 2] =
                    my_string.charAt(my_string.length() / 2);
            }
        }
        // System.out.println(Arrays.toString(result));
        String answer = new String(result);
        return answer;
    }
}