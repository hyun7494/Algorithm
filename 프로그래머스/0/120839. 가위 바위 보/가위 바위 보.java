import java.util.*;
class Solution {
    public String solution(String rsp) {
        String[] temp = rsp.split("");
        StringBuilder stringbuilder = new StringBuilder();
        
        for (int i = 0; i<temp.length; i++) {
            if (temp[i].equals("2")) {
                stringbuilder.append("0");
            } else if (temp[i].equals("0")) {
                stringbuilder.append("5");
            } else {
                stringbuilder.append("2");
            }
        }
        String answer = stringbuilder.toString();
        return answer;
    }
}