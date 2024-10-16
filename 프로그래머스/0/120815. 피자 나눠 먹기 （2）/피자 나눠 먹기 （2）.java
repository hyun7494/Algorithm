class Solution {
    public int gcd (int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a%b);
    }
    public int solution(int n) {
        // 최소공배수를 구하고 최소공배수에서 /6한 값
        
        int num = gcd(n, 6);
        int lcm = (n/num)*num*(6/num);
        
        System.out.println(num);
        
        int answer = lcm/6;
        return answer;
    }
}