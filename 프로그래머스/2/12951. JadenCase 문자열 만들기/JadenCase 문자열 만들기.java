class Solution {
    public String solution(String s) {
        String answer = "";
        String ns = " " + s;
        
        for (int i = 1; i <= s.length(); i++) {
            if (ns.charAt(i-1) == ' ') {
                String upper = Character.toString(Character.toUpperCase(ns.charAt(i)));
                answer += upper;
            } else {
                String lower = Character.toString(Character.toLowerCase(ns.charAt(i)));
                answer += lower;
            }
        }
        return answer;
    }
}