package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// [기초-종합] 수 나열하기1
// 등차수열 식 = a + (n-1) * d
public class CU_1089 {
    public static void main(String[] args) throws IOException {

        // 내 풀이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int num = 0;
        for (int i=0; i<n; i++){
            num = a + (d * i);
        }
        System.out.println(num);


        // 다른 사람 풀이
        int total = a;
        for (int i=1; i<n; i++){
            total += d;
        }
        System.out.println(total);

        // 다른 사람 등차수열 수식 활용 풀이 (for문 사용 x)
        int result = 0;
        result = a + (n-1)*d;
        System.out.println(result);
    }
}
