package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// [기초-출력변환] 영문자 1개 입력받아 10진수로 출력하기
public class CU_1036 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char c = br.readLine().charAt(0);
        br.close();
        System.out.println((int)c);
    }
}
