class Solution {
    
    public int solution(int n) {
        int answer = 0;
        
        // 1부터 n까지 연속된 수들의 합을 검사
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = i; sum < n; j++) {
                sum += j;
                if (sum == n) {
                    answer++;
                    break; // 합이 n과 일치하면 더 이상 진행하지 않아도 됨
                }
            }
        }
        
        return answer;
    }
}
