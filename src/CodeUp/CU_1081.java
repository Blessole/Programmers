package CodeUp;

import java.util.Scanner;

// [기초-종합] 주사위를 2개 던지면?
public class CU_1081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                System.out.printf("%d %d\r\n", i, j);
            }
        }
    }
}
