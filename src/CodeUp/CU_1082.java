package CodeUp;

import java.util.Scanner;

// [기초-종합] 16진수 구구단?
public class CU_1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(16);
        for(int i=1; i<16; i++){
            System.out.printf("%X*%X=%X\r\n", n, i, n*i);
        }
    }
}
