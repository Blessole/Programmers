package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// [기초-삼항연산] 정수 3개 입력받아 가장 작은 수 출력하기
public class CU_1064 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[st.countTokens()];
        for (int i=0; st.hasMoreTokens(); i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int a = arr[0];
        int b = arr[1];
        int c = arr[2];
        System.out.println((a<b ? a : b) < c ? (a<b ? a : b) : c);
    }
}
