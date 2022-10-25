package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// A -> B
public class BJ_16953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        int answer = 1;
        while (B != A){
            if (B < A) {
                answer = -1;
                break;
            }

            String str = String.valueOf(B);

            // 맨 끝자리가 1이 아니면서, B가 2로 나누어 떨어지지 않는다면 A로 만들 수 없음
            if (str.charAt(str.length() -1) != '1' && B % 2 != 0){
                answer = -1;
                break;
            }

            // B가 2로 나누어 떨어진다면, 2로 나눈다
            if (B%2 == 0){
                B >>= 1;
            } else { // 그렇지 않고, 맨 끝자리가 1이라면 1을 없앤다
                str = str.substring(0, str.length()-1);
                B = Long.parseLong(str);
            }
            answer++;   // 횟수 증가
        }
        System.out.println(answer);
    }
}
