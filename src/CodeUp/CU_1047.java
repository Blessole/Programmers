package CodeUp;

import java.util.Scanner;

// [기초-비트시프트연산] 정수 1개 입력받아 2배 곱해 출력하기
public class CU_1047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num<<1);
    }

}
