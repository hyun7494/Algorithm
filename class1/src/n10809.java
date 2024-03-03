import java.util.Scanner;

public class n10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        // 무식하게 배열에 넣고 했는데 반복문을 사용할 수 있음
//        String[] Alphabet =  {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
//        for(int i=0; i<Alphabet.length; i++){
//            System.out.print(S.indexOf(Alphabet[i])+" ");
//        }
        for(char c='a'; c<='z'; c++){
            System.out.print(S.indexOf(c)+" ");
        }
    }
}
