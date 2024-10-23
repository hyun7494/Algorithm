import java.util.*;
import java.util.regex.*;
class Solution {
    public boolean solution(String s) {
        boolean tempBoolean = true;
        if (s.length() != 4 && s.length() != 6) {
            tempBoolean = false;
        }
        char[] temp = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            temp[i] = s.charAt(i);
        }
        for (char c : temp) {
            if (Pattern.matches("[a-zA-Z]", String.valueOf(c))) {
                tempBoolean = false;
            }
        }
        System.out.print(Arrays.toString(temp));
        boolean answer = tempBoolean;
        return answer;
    }
}