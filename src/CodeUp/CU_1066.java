package CodeUp;

import java.util.Scanner;
import java.util.StringTokenizer;

// [기초-조건/선택실행구조] 정수 3개 입력받아 짝/홀 출력하기
public class CU_1066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
        int[] arr = new int[st.countTokens()];

        for (int i =0; st.hasMoreTokens(); i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}
