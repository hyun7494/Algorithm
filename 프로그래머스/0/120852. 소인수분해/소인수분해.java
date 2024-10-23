import java.util.*;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> temp = new ArrayList<>(); 
        
        for(int i = 2; i <= n; i++) {
            while (n % i == 0) {
                if (!temp.contains(i)) {
                    temp.add(i); // i를 소인수로 추가
                }
                
                n /= i; // n을 i로 나눔
            }
        }
        int[] answer = new int[temp.size()];
        for (int j = 0; j < temp.size(); j++) {
            answer[j] = temp.get(j);
        }
        System.out.println(temp.toString());
        
        return answer;
    }
}