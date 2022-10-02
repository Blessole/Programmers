package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// [기초-종합] 수 나열하기3
public class CU_1091 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        long result = a;
        for (int i=1; i<n; i++){
            result = result * m + d;
        }
        System.out.println(result);
    }
}
