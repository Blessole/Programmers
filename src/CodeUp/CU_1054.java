package CodeUp;

import java.util.Scanner;

// [기초-논리연산] 둘 다 참일 경우만 참 출력하기
public class CU_1054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a==1 && b==1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
