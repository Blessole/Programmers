package Level_1;

import java.util.*;

// 직사각형 별 찍기
public class RectangularStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i=0; i<b; i++) {
            for (int j=0; j<a; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}