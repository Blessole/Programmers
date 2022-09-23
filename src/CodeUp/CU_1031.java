package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// [기초-출력변환] 10진 정수 1개 입력받아 8진수로 출력하기
public class CU_1031 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        br.close();
        String print = Integer.toOctalString(num);
        System.out.println(print);
    }
}
