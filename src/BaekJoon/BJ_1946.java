package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 신입사원
public class BJ_1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i=0; i<n; i++){
            int count = 1;
            int N1 = Integer.parseInt(br.readLine());
            int arr[] = new int[N1+1];
            for(int j=0; j<N1; j++){
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                arr[Integer.parseInt(st.nextToken())] = Integer.parseInt(st.nextToken());
            }

            int vot = arr[1];

            for(int j=2; j<=N1; j++){
                if (arr[j] < vot) {
                    vot=arr[j];
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
