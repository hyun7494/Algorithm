class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {0,0};
        int gcd = gcd(denom1, denom2);
        int num1 = denom1/gcd;
        int num2 = denom2/gcd;
        int lcm = gcd * num1 * num2;
        answer[1] = lcm;
        answer[0] = numer1*(lcm/denom1) + numer2*(lcm/denom2);
        // System.out.println("gcd: "+gcd);
        int lastNum =  gcd(answer[1], answer[0]);
        answer[0] = answer[0]/lastNum;
        answer[1] = answer[1]/lastNum;
        
        
        return answer;
    }
    
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}