import java.util.*;

public class n1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        Map<Character, Integer> count = new HashMap<>();

        for(int i=0; i<word.length(); i++){
            for(int j=0; j<=i; j++){
                if(count.containsKey(word.charAt(j))){
                    count.put(word.charAt(j),+1);
                }else{
                    count.put(word.charAt(j),1);
                }
            }
        }
        Integer maxValue = Collections.max(count.values());
        System.out.println(maxValue);
    }
}
