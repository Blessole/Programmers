package CodeUp;

import java.util.Scanner;

// [기초-비교연산] 두 정수 입력받아 비교하기4
public class CU_1052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = b!=a ? 1 : 0;
        System.out.println(result);
    }
}
