package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// [기초-산술연산] 정수 2개 입력받아 합 출력하기1
public class CU_1038 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        br.close();
        long[] arr = new long[st.countTokens()];
        for (int i=0; st.hasMoreTokens(); i++){
            arr[i] = Long.parseLong(st.nextToken());
        }
        System.out.println(arr[0]+arr[1]);
    }
}
