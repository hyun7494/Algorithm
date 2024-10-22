class Solution {
    public int solution(int[] numbers, int k) {
        int temp = 2*(k-1);
        int result = 0;
        int answer = 0;
        if (temp > numbers.length) {
            result = temp % numbers.length;
            // System.out.println(numbers[result]);
            answer = numbers[result];
        } else {
            // System.out.println(numbers[temp]);
            answer = numbers[temp];
        }
        
        return answer;
    }
}