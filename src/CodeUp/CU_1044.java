package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// [기초-산술연산] 정수 1개 입력받아 1 더해 출력하기
public class CU_1044 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long l = Long.parseLong(br.readLine());
        System.out.println(++l);
    }
}
