package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// [기초-2차원배열] 바둑알 십자 뒤집기
public class CU_1097_chk {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[20][20];
        for (int i=1; i<arr.length; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=1; j<arr.length; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int n = Integer.parseInt(br.readLine());

        for(int m=0; m<n; m++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st1.nextToken());
            int y = Integer.parseInt(st1.nextToken());

            for (int i=1; i<arr.length; i++){
                if (arr[x][i] == 0) arr[x][i] =1;
                else arr[x][i] =0;
            }
            for (int j=1; j<arr.length; j++){
                if (arr[j][y] == 0) arr[j][y] =1;
                else arr[j][y] =0;
            }
        }

        for(int i=1; i<arr.length; i++){
            for(int j=1; j<arr.length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
