import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        //솔루션 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String original = st.nextToken();
//        System.out.println(n);
        // [0~9] 배열 만들어서 n.charAt()으로 해당하는 인덱스에 값 +1하고
        // 끝나면 뒤에서부터 갯수만큼 sb에 추가하기

        // 배열 만들기
        int[] array = new int[10];

        // original.charAt()
        for(int i = 0; i < original.length(); i++) {
            int a = Integer.parseInt(String.valueOf(original.charAt(i)));
            int b = array[a];
            array[a] = b+1;
        }

//        System.out.println(Arrays.toString(array));
        // 만들 문자열 생성
        StringBuilder sb = new StringBuilder();

        // 뒤에서 부터 sb에 넣기
        for (int j = 9; j >= 0; j--) {
            for(int k = 0; k < array[j]; k++) {
                sb.append(j);
            }
        }

        System.out.println(sb);



    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}