package CodeUp;

import java.util.Scanner;

// [기초-반복실행구조] 정수 입력받아 계속 출력하기
public class CU_1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int arr[] = new int[total];
        for (int i=0; i<total; i++){
            arr[i] = sc.nextInt();
            System.out.println(arr[i]);
        }
    }
}
