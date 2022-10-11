package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 강의실 배정
public class BJ_11000 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // input 데이터를 2차원 배열로 받기
        int[][] time = new int[N][2];
        StringTokenizer st;
        for (int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            time[i][0] = Integer.parseInt(st.nextToken());
            time[i][1] = Integer.parseInt(st.nextToken());
        }

        // input 데이터를 오름차순으로 정렬
        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {

                if(o1[0] == o2[0]){ // 시작시간이 같은 경우, 끝나는 시간을 오름차순 정렬
                    return o1[1] - o2[1];
                }
                return o1[0] - o2[0];
            }
        });

        // PriorityQueue 만들고, 첫번째 배열의 끝나는 시간을 큐에 넣는다
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(time[0][1]);

        // 배열의 두 번째 값부터 순회하면서,
        for(int i=1; i<N; i++){
            // 시작 시간이 pq의 peek()보다 작거나 같다면, pq에서 하나를 뺌
            if(pq.peek() <= time[i][0]) pq.poll();

            // 현재 end 값을 새로 pq에 넣어줌
            pq.add(time[i][1]);
        }

        // pq에 남아있는 데이터 개수가 필요한 강의실의 개수임
        System.out.println(pq.size());
        br.close();
    }
}
