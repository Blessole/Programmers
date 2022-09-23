package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// [기초-출력변환] 8진 정수 1개 입력받아 10진수로 출력하기
public class CU_1034 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        int n = Integer.parseInt(num, 8);
        System.out.println(n);
    }
}
