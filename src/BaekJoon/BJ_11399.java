package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// ATM (Counting Sort)
public class BJ_11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());        // 인원 수
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int arr[] = new int[1001];

        // Counting Sort
        while(N-- > 0){
            arr[Integer.parseInt(st.nextToken())]++;
        }

        int prev = 0; // 이전까지 대기시간 누적 합
        int sum = 0; // 사람별 대기시간 총 합

        for (int i=0; i<1001; i++){

            while (arr[i]-- > 0){            // 해당 i index가 0이 될 때까지 반복

                // 이전까지의 대기시간과 현재 사람이 걸리는 시간을 더함
                sum += (i+prev);

                // 이전까지의 누적 합에 현재 걸리는 시간 더함
                prev += i;
            }
        }
        System.out.println(sum);
    }
}
