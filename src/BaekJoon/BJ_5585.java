package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 거스름돈
public class BJ_5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int price = 1000-Integer.parseInt(br.readLine());

        int[] arr = {500, 100, 50, 10, 5, 1};
        int count = 0;
        for (int i=0; i<6; i++){
            if (price > arr[i] || price > 0) {
                int m = price / arr[i];
                price -= (m*arr[i]);
                count += m;
            }
        }
        System.out.println(count);
    }
}
