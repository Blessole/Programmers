package CodeUp;

import java.util.Scanner;

// [기초-비트단위논리연산] 비트단위로 AND 하여 출력하기
public class CU_1060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a&b);
    }
}
