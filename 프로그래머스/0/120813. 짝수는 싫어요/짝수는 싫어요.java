import java.util.*;
class Solution {
    public int[] solution(int n) {
        int count = 0;
        if (n % 2 == 0) {
            count = n/2 ;
        } else {
            count = n/2 + 1;
        }
        // System.out.println("count = " + count);
        int[] answer = new int[count];
        // System.out.println(Arrays.toString(answer));
        for(int j = 0; j < count; j++) {
            answer[j] = (j*2 + 1);
            // System.out.print(j);
        }
        return answer;
    }
}