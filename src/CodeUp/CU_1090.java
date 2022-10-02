package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// [기초-종합] 수 나열하기2 (등비수열)
// 등비수열 식 = a * r ^ (n-1)
public class CU_1090 {
    public static void main(String[] args) throws IOException {
        // 내 풀이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        long result = 0;        // 값이 누적되면 int 범위를 벗어나기 때문에 long으로 선언!!!!

        for (int i=0; i<n; i++){
            result = (long)(a * Math.pow(r, i));
        }
        System.out.println(result);


        // 다른 사람 풀이
        long a1 = Long.parseLong((st.nextToken()));
        int r1 = Integer.parseInt(st.nextToken());
        int n1 = Integer.parseInt(st.nextToken());

        for (int i=1; i<n1; i++){
            a1 *= r1;       // a = a*r : 시작값 a에 등비값 r을 곱해서 저장
        }
        System.out.println(a1);


        // 다른 사람 등비수열 수식 활용 풀이 (for 문도 사용 x)
        result = (long)(a*Math.pow(r, n-1));
        System.out.println(result);
    }
}
