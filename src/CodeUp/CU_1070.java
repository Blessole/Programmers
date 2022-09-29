package CodeUp;

import java.util.Scanner;

// [기초-조건/선택실행구조] 월 입력받아 계절 출력하기
public class CU_1070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        switch (month){
            case 1 :
            case 2 :
            case 12 :
                System.out.println("winter");
                break;
            case 3 :
            case 4 :
            case 5 :
                System.out.println("spring");
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("summer");
                break;
            case 9 :
            case 10 :
            case 11 :
                System.out.println("fall");
                break;
        }
    }
}
