package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 단어 수학
public class BJ_1339 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] alpha = new int[26];

        for(int i=0; i<N; i++){
            String line = br.readLine();
            int size = line.length();
            int base = (int) Math.pow(10, size-1);
            for (int j=0; j<size; j++){
                alpha[line.charAt(j)-'A'] += base;
                base /= 10;
            }
        }
        Arrays.sort(alpha);

        int ans = 0;
        for (int x=25; x>=17; x--){
            ans += alpha[x] * (x-16);
        }
        System.out.println(ans);

    }
}
