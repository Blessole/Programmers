package CodeUp;

import java.util.Scanner;

// [기초-입출력] 정수 2개 입력받아 그대로 출력하기
public class CU_1013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(x + " " + y);
    }
}
