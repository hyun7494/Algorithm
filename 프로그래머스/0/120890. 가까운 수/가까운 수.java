import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int min = array[array.length-1];
        System.out.println("최초 min: " + min);
        
        int absMin = Math.abs(array[array.length-1]-n);
        System.out.println("최초 absMin: " + absMin);
        
        for (int i = array.length-1; i >= 0; i--) {
            if (absMin >= Math.abs(array[i] - n)) {
                absMin = Math.abs(array[i] - n);
                if (min > array[i]) {
                    min = array[i];
                }
            }
        }
        
        int answer = min;
        return answer;
    }
}