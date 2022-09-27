package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// [기초-산술연산] 정수 3개 입력받아 합과 평균 출력하기
public class CU_1046 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[st.countTokens()];
        for (int i=0; st.hasMoreTokens(); i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int sum = arr[0]+arr[1]+arr[2];
        double avg = (sum)/3f;
        System.out.printf("%d\r\n%.1f", sum, avg);
    }
}
