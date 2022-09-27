package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// [기초-산술연산] 정수 1개 입력받아 부호 바꿔 출력하기
public class CU_1040 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(-Integer.parseInt(br.readLine()));
    }
}
