class Solution {
    public int solution(int[] box, int n) {
        int a = 0;
        int b = 0;
        int c = 0;
        a = box[0]/n;
        b = box[1]/n;
        c = box[2]/n;
        int answer = a*b*c;
        return answer;
    }
}