import java.util.Scanner;


public class n2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            int m = sc.nextInt();
            String line = sc.next();

            for(int j=0; j<line.length(); j++){
                char c = line.charAt(j);
                for(int k=0; k<m; k++){
                    System.out.print(c);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
