package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// [기초-종합] 3의 배수는 통과?
public class CU_1088 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for (int i=1; i<=num; i++){
            if (i % 3 == 0) {
                continue;
            }
            System.out.printf("%d ", i);
        }
    }
}
