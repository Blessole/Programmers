package CodeUp;

import java.util.Scanner;

// [기초-삼항연산] 두 정수 입력받아 큰 수 출력하기
public class CU_1063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a > b ? a : b);
    }
}
