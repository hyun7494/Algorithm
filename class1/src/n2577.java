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
//        System.out.println(toStr);
//        System.out.println(toStr.length());

        for(int j=0; j<10; j++) {
            int count = 0;
            for (int i = 0; i < toStr.length(); i++) {
                //            System.out.println(toStr.charAt(i));
                if (j == Integer.parseInt(String.valueOf(toStr.charAt(i)))) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}