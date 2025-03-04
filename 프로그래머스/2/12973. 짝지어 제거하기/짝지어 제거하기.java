import java.util.*;
class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if(!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        int answer = 1;
        if (stack.size() > 0) {
            answer = 0;
        }
        return answer;
    }
}