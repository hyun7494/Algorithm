import java.util.*;

class Solution {
    public String solution(String my_string, String letter) {

        StringBuilder stringBuilder = new StringBuilder();
        
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) != letter.charAt(0)) {
                stringBuilder.append(my_string.charAt(i));
            }
        }
        
        return stringBuilder.toString();
    }
}