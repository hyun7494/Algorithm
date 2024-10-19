class Solution {
    public String solution(String my_string, int n) {
        char[] array = new char[my_string.length()*n];
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i<my_string.length(); i++) {
            stringbuilder.append(Character.toString(my_string.charAt(i)).repeat(n));    
        }
        
        // System.out.println(stringbuilder);
        String answer = stringbuilder.toString();
        return answer;
    }
}