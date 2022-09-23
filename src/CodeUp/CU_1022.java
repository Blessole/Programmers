package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// [기초-입출력] 문장 1개 입력받아 그대로 출력하기
public class CU_1022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("%s", br.readLine());
    }
}
