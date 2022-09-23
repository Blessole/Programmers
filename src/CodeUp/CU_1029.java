package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// [기초-데이터형] 실수 1개 입력받아 그대로 출력하기2
public class CU_1029 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double f = Double.parseDouble(br.readLine());
        System.out.printf("%.11f", f);
    }
}
