package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// [기초-입출력] 년월일 입력 받아 형식 바꿔 출력하기
public class CU_1027 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ".");
        int[] arr = new int[st.countTokens()];
        for (int i=0; st.hasMoreTokens(); i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.printf("%02d-%02d-%04d", arr[2], arr[1], arr[0]);
    }
}
