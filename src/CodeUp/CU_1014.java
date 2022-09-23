package CodeUp;

import java.util.Scanner;

// [기초-입출력] 문자 2개 입력받아 순서 바꿔 출력하기
public class CU_1014 {
    public static void main(String[] args) {
        // 내 풀이
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        System.out.println(b + " " + a);

        // 다른 풀이
        // %d : decimal(정수) / %s : string(문자) / %f : float(실수)
        Scanner scanner1 = new Scanner(System.in);
        char x = scanner1.next().charAt(0);
        char y = scanner1.next().charAt(0);
        System.out.printf("%s %s", y, x);
    }
}
