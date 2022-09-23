package CodeUp;

import java.util.Scanner;

// [기초-입출력] 문자 1개 입력받아 그대로 출력하기
public class CU_1011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char x = scanner.next().charAt(0);
        System.out.println(x);
    }
}
