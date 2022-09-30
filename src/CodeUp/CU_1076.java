package CodeUp;

import java.util.Scanner;

// [기초-반복실행구조] 문자 1개 입력받아 알파벳 출력하기
public class CU_1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char x = sc.nextLine().charAt(0);
        char t='a';
        do {
            System.out.printf("%c ", t);
            t++;
        } while (t<x+1);
    }
}
