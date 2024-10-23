class Solution {
    public int solution(int n) {
        
        int sum = 1;
        int result = 0;
        
        for (int i = 1; i <= 10; i++) {
            sum *= i;
            if (n == sum) {
                result = i;
                break;
            } else if (n < sum ) {
                result = i-1;
                break;
            }
        }
        
        int answer = result;
        return answer;
    }
}