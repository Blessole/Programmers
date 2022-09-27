package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// [기초-산술연산] 정수 2개 입력받아 자동 계산하기
public class CU_1045 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[st.countTokens()];
        for (int i=0; st.hasMoreTokens(); i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(arr[0]+arr[1]);
        System.out.println(arr[0]-arr[1]);
        System.out.println(arr[0]*arr[1]);
        System.out.println(arr[0]/arr[1]);
        System.out.println(arr[0]%arr[1]);
        double a = (double)arr[0];
        System.out.printf("%.2f", a/arr[1]);
    }
}
