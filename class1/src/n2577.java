import java.util.Scanner;

public class n2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        sc.close();
        int result = A*B*C;
        String toStr = Integer.toString(result);
        System.out.print(result);

        for(int i=0; i<toStr.length(); i++){
            int count = 0;
            for(int j=0; j<10; j++){
                if(toStr.charAt(i) == j){
                    count += 1;
                    System.out.print(toStr.charAt(i));
                }
//                System.out.println(count);
            }
        }

    }
}