package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 동전 0
public class BJ_11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 가진 동전의 종류 N
        int N = Integer.parseInt(st.nextToken());
        // 동전 가치의 합 K
        int K = Integer.parseInt(st.nextToken());

        int coin[] = new int[N];
        for (int i=0; i<=N-1; i++){
            coin[i] = Integer.parseInt(br.readLine());
        }

        int count=0;
        for(int i=N-1; i>=0; i--){
            // 현재 동전의 가치가 K보다 작거나 같아야 구성됨
            if (coin[i] <= K) {
                count += (K/coin[i]);
                K = K % coin[i];
            }
        }

        System.out.println(count);
    }
}
