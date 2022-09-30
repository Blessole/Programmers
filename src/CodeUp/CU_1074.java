package CodeUp;

import java.util.Scanner;

// [기초-반복실행구조] 정수 1개 입력받아 카운트다운 출력하기1
public class CU_1074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i=a; i>0; i--){
            System.out.println(i);
        }
    }
}
