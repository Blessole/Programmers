package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// [기초-출력변환] 10진 정수 입력받아 16진수로 출력하기2
public class CU_1033 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        br.close();
        String print = Integer.toHexString(num).toUpperCase();
        System.out.println(print);
    }
}
