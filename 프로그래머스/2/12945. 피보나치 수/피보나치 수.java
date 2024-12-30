import java.util.*;
class Solution {
    static int[] memo = new int[100001];
    
    public int fibo(int m) {
        if (m == 0) {
            return 0;
        }
        if (m == 1) {
            return 1;
        }
        if (memo[m] != -1) {
            return memo[m];
        }
        return memo[m] = (fibo(m-1) + fibo(m-2))%1234567;
        }
    
    public int solution(int n) {
        Arrays.fill(memo, -1);
        int k = fibo(n);
        int answer = k;
        return answer;
    }
}