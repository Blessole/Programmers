package CodeUp;

import java.util.Scanner;

// [기초-입출력] 정수 1개 입력받아 3번 출력하기
public class CU_1017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(x + " " + x + " " + x);

        // printf로 출력하기 (%d = decimal 정수!)
        System.out.printf("%d %d %d", x, x, x);
    }
}
