package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// [기초-입출력] 실수 1개 입력받아 부분별로 출력하기
public class CU_1023 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 내 풀이
        StringTokenizer st = new StringTokenizer(br.readLine(), ".");
        int[] arr = new int[st.countTokens()];
        for (int i = 0; st.hasMoreTokens(); i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.printf("%d\r\n%d", arr[0], arr[1]);

        // 좀 더 간단한 정답
        String[] arr1 = br.readLine().split("\\.");
        System.out.printf("%s\r\n%s", arr1[0], arr1[1]);
    }
}
