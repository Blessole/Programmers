package CodeUp;

import java.util.Scanner;

// [기초-입출력] 실수 1개 입력받아 그대로 출력하기
public class CU_1012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float n = scanner.nextFloat();

        // 형식 태그 & 서식 지정자!
        // 형식 태그 첫 문자는 %로 시작함
        // f : 실수(float)
        // .6 : 소수점 이하 6자리 표시 위함
        System.out.printf("%.6f", n);
    }
}
