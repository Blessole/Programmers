package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// [기초-2차원배열] 바둑판에 흰 돌 놓기
public class CU_1096 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[20][20];
        for (int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
        }
        for (int x=1; x<=19; x++){
            for (int y=1; y<=19; y++){
                System.out.printf("%d ", arr[x][y]);
            }
            System.out.printf("\n");
        }
    }
}
