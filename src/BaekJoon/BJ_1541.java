package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 잃어버린 괄호
public class BJ_1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = Integer.MAX_VALUE;    // 초기 상태 여부 확인을 위한 값으로 설정
        StringTokenizer subtraction = new StringTokenizer(br.readLine(), "-");

        while (subtraction.hasMoreTokens()) {
            int temp=0;

            // 뺄셈으로 나뉜 토큰을 덧셈으로 분리하여 해당 토큰들을 더함
            StringTokenizer addition = new StringTokenizer(subtraction.nextToken(), "-");

            // 덧셈으로 나뉜 토큰들을 모두 더함
            while(addition.hasMoreTokens()) {
                temp += Integer.parseInt(addition.nextToken());
            }

            // 첫번째 토큰인 경우 temp값이 첫번째 수가 됨
            if (sum == Integer.MAX_VALUE){
                sum = temp;
            } else {
                sum -= temp;
            }
        }
        System.out.println(sum);
    }
}
