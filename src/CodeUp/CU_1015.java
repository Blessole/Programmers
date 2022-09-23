package CodeUp;

import java.util.Scanner;

// [기초-입출력] 실수 입력받아 둘째 자리까지 출력하기
public class CU_1015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float n = scanner.nextFloat();
        System.out.printf("%.2f", n);
    }
}
