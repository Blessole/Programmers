package CodeUp;

import java.util.Scanner;

public class CU_1050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = a==b ? 1 : 0;
        System.out.println(result);
    }
}
