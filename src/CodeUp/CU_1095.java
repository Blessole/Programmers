package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// [기초-1차원배열] 이상한 출석 번호 부르기3
public class CU_1095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int min = 24;
        int[] arr = new int[Integer.parseInt(br.readLine())];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if (min>arr[i]) min = arr[i];
        }
        System.out.println(min);
    }
}
