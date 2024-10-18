import java.util.*;

class Solution {
    public int solution(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int n : array) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        List<Integer> keySet = new ArrayList<>(map.keySet());
        
        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        
        if (keySet.size() == 1) {
            return keySet.get(0);
        }
        
        else if (map.get(keySet.get(0)) == map.get(keySet.get(1))) {
            return -1;
        }
        
        return keySet.get(0);
    }
}