package CodeUp;

import java.util.Scanner;

// [기초-종합] 언제까지 더해야 할까?
public class CU_1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 내 풀이 (do~while)
        int sum = 0;
        int num = 1;
        int next = sc.nextInt();
        do {
            sum += num;
            num++;
        } while(sum<next);
        System.out.println(num-1);

        // 다른 풀이 (for문)
        int sum1 = 0;
        int next1 = sc.nextInt();
        for (int i=1; i<1000; i++){
            sum1 += i;
            if (next1 <= sum1) {
                System.out.println(i);
                break;
            }
        }
    }
}
