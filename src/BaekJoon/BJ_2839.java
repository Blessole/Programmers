package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 설탕 배달
public class BJ_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N  = Integer.parseInt(br.readLine());       // 배달할 설탕 무게

        if ( N==4 || N==7){
            System.out.println(-1);
        } else if (N%5 == 0){
            System.out.println(N/5);
        } else if (N%5 == 1 || N%5 == 3){
            System.out.println((N/5)+1);
        } else if (N%5 == 2 || N%5 ==4) {
            System.out.println((N/5) +2);
        }

        // 솔망진창.. 내 코드
        int kg5 = 0;
        int kg3 = 0;

        while(true){
            kg5 = N/5;
            kg3 = (N-kg5*5)/3;
            if (3>N || 5>N){
                System.out.println(-1);
            } else if ((N-kg5*5-kg3*3) != 0){
                if ((N%3) != 0 ) {
                    kg3 = N/3;
                    kg5 = (N-kg3*3)/5;
                    System.out.println(kg5+kg3);
                    if (kg5 !=0 && (N-kg5*5-kg3*3) != 0) {
                        System.out.println(-1);
                    }
                } else {
                    System.out.println(N/3);
                }
            } else {
                System.out.println(kg5+kg3);
            }
            break;
        }
    }
}
