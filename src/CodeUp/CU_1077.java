package CodeUp;

import java.util.Scanner;

// [기초-반복실행구조] 정수 1개 입력받아 그 수까지 출력하기
public class CU_1077 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 0;
        int num = sc.nextInt();
        do {
            System.out.printf("%d\r\n", x);
            x++;
        } while(x<num+1);
    }
}
