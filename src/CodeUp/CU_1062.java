package CodeUp;

import java.util.Scanner;

// [기초-비트단위논리연산] 비트단위로 XOR 하여 출력하기
// 사용 예시 : 두 장의 이미지가 겹쳤을 때 색이 서로 다른 부분만 처리할 수 있음!
public class CU_1062 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a^b);
    }
}
