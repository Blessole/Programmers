package CodeUp;

import java.util.Scanner;

// [기초-종합] 3 6 9 게임의 왕이 되자!
public class CU_1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){
            if (i%3 == 0){
                System.out.printf("%s ", "X");
            } else System.out.printf("%d ", i);
        }
    }
}
