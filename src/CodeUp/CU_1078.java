package CodeUp;

import java.util.Scanner;

// [기초-종합] 짝수 합 구하기
public class CU_1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int sum = 0;
        for (int i=1; i<=x; i++){
            if(i%2 ==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
