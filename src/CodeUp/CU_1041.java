package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// [기초-산술연산] 문자 1개 입력받아 다음 문자 출력하기
public class CU_1041 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char value = br.readLine().charAt(0);
        System.out.println((char)(value+1));
    }
}
