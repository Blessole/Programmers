package CodeUp;

import java.util.Scanner;

// [기초-반복실행구조] 0 입력될 때까지 무한 출력하기1
// Java에는 goto 문이 없음!
public class CU_1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int a = sc.nextInt();
            if (a == 0) {
                break;
            }
            System.out.println(a);
        }
    }
}
