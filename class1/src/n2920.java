import java.util.Scanner;

public class n2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String q = sc.nextLine();
        sc.close();
//        System.out.println(q);
        String state = "ascending";


        for(int i=0; i<=12; i+=2){
            // 변수 초기화가 안돼서 첫번째 계산 값 만으로 계속 반복했었음;;
            int prev = Character.getNumericValue(q.charAt(i));
            int next = Character.getNumericValue(q.charAt(i+2));
            if(next-prev == 1){
                state = "ascending";
            } else if (next-prev == -1) {
                state = "descending";
            } else{
                state="mixed";
                break;
            }
        }
        System.out.println(state);
    }
}
