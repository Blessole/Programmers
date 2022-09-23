package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// [기초-출력변환] 16진 정수 1개 입력받아 8진수로 출력하기
public class CU_1035 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine(), 16);
        br.close();
        System.out.printf("%o", n);
    }
}
