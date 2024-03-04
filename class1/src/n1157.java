import java.util.*;

public class n1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        Map<Character, Integer> count = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char ch = Character.toUpperCase(word.charAt(i));
            count.put(ch, count.getOrDefault(ch, 0) + 1);
        }
        int maxValue = Collections.max(count.values());
        List<Character> maxKeys = new ArrayList<>();

        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            if (entry.getValue() == maxValue) {
                maxKeys.add(entry.getKey());
            }
        }

        if (maxKeys.size() == 1) {
            System.out.println(maxKeys.get(0));
        } else {
            System.out.println("?");
        }

    }
}
