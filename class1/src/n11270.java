import java.util.Scanner;

public class n11270 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first;
        String second;
        
        first = sc.nextInt();
        second = sc.next();
        int sum = 0;
        for(int i=0; i < first; i++){
            sum += second.charAt(i)-'0';
// charAt 때문에 아스키 코드값으로 넘어감 그래서 '0'을 사용
        }
        System.out.println(sum);
    }
}
