package CodeUp;

import java.util.Scanner;

// [기초-비교연산] 두 정수 입력받아 비교하기1
public class CU_1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = a <= b ? 0 : 1;
        System.out.println(result);
    }
}
