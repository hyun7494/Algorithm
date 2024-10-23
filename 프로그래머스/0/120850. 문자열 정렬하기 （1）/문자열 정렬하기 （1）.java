import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        
        String temp = my_string.replaceAll("[a-z]","");
        int[] result = new int[temp.length()];
        
        for (int i = 0; i < temp.length(); i++) {
            result[i] = Character.getNumericValue(temp.charAt(i));
        }
        Arrays.sort(result);
        int[] answer = result;
        return answer;
    }
}