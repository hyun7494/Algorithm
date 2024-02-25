import java.util.Scanner;

public class n3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] remain = new int[10];

        for(int i=0; i<10; i++){

            remain[i] = sc.nextInt()%42;
//            System.out.println(remain[i]);
        }
        int count = 0;

        for(int j=0; j<10; j++){
            boolean check = false;
            for(int k=j+1; k<10; k++){
                if(remain[j] == remain[k]){
                    check=true;
                    break;
                }
            }
            if(check == false){
                count++;
            }
        }
        System.out.println(count);
        sc.close();

    }
}
