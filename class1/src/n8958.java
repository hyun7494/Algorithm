import java.util.Scanner;

public class n8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i<T; i++){
            String S = sc.next();
            int count = 0;
            int calc = 0;
            for(int j=0; j<S.length(); j++){
                if(S.charAt(j) == 'O'){
                   count += 1;
                }else{
                    count = 0;
                }
                calc += count;
            }
            System.out.println(calc);
        }
    }
}
