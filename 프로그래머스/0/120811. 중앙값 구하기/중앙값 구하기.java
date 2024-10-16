class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for (int i = 0; i< array.length-1; i++) {
            for (int j = 0; j < array.length -1 - i; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            
            
        }
        if (array.length-1 == 0) {
            answer = array[0];
            return answer;
        } else {
            float loc = (array.length-1)/2;
            int loc2 = (int)loc;
            answer = array[loc2];
            return answer;
        }
        
    }
}