package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 수들의 합
public class BJ_1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long S = Integer.parseInt(br.readLine());

        long sum = 0;
        long count = 0;

        // method1. for 문 이용하기
        for (int i=1; ; i++){
            if (sum>S) break;
            sum += i;
            count++;
        }
        System.out.println(count-1);

        // method2. while 문 이용하기
        int i=0;
        while(true){
            sum += ++i;
            count++;

            if (sum > S){
                System.out.println(count-1);
                break;
            }
        }

    }
}
