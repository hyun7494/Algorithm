import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] first = {1,2,3,4,5,};
        int[] second = {2,1,2,3,2,4,2,5,};
        int[] third = {3,3,1,1,2,2,4,4,5,5,};
        int firstCount = 0;
        int secondCount = 0;
        int thirdCount = 0;
        
        for(int i = 0; i<answers.length; i++) {
            if (answers[i] == first[i % first.length]) {
                firstCount += 1;
            }
            
            if (answers[i] == second[i % second.length]) {
                secondCount += 1;
            }
            
            if (answers[i] == third[i % third.length]) {
                thirdCount += 1;
            }
        }
        
        int max = Math.max(Math.max(firstCount,secondCount),thirdCount);
        List<Integer> temp = new ArrayList<>();
        if (max == firstCount) {
            temp.add(1);
        }
        if (max == secondCount) {
            temp.add(2);
        }
        if (max == thirdCount) {
            temp.add(3);
        }
        
        int[] answer = temp.stream()
            .mapToInt(i -> i)
            .toArray();
        return answer;
    }
}