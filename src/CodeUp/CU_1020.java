package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// [기초-입출력] 주민번호 입력받아 형태 바꿔 출력하기
public class CU_1020 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");
        int[] arr = new int[st.countTokens()];
        for (int i=0; st.hasMoreTokens(); i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.printf("%06d%07d", arr[0], arr[1]);
    }
}
