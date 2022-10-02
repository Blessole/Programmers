package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// [기초-종합] 여기까지! 이제 그만~
public class CU_1087 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i=1; i<=num; i++){
            sum += i;
            if (sum>=num) {
                System.out.println(sum);
                break;
            }
        }
    }
}
