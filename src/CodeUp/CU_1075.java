package CodeUp;

import java.util.Scanner;

// [기초-반복실행구조] 정수 1개 입력받아 카운트다운 출력하기2
public class CU_1075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a>0) {
            System.out.println(a-1);
            a--;
        }
    }
}
