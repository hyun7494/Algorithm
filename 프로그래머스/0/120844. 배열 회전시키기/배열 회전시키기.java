class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] result = new int[numbers.length];
        
        if (direction.equals("right")) {
            result[0] = numbers[numbers.length - 1];
            
            for (int i = 1; i < numbers.length; i++) {
                result[i] = numbers[i - 1];
            }
        } else {
            result[numbers.length - 1] = numbers[0];
            
            for (int i = 0; i < numbers.length - 1; i++) {
                result[i] = numbers[i + 1];
            }
        }
        
        return result;
    }
}
