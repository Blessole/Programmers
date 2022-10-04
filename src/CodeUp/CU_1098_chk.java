package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// [기초-2차원배열] 설탕과자 뽑기
public class CU_1098_chk {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int[][] arr = new int[h+1][w+1];
        int n = Integer.parseInt(br.readLine());
        for (int i=0; i<n; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st1.nextToken());
            int d = Integer.parseInt(st1.nextToken());
            int x = Integer.parseInt(st1.nextToken());
            int y = Integer.parseInt(st1.nextToken());

            if (d==0){
                for(int j=0; j<l; j++){
                    arr[x][y+j] = 1;
                }
            }
            else if (d == 1) {
                for(int j=0; j<l; j++){
                    arr[x+j][y]=1;
                }
            }
        }
        for (int i=1; i<=h; i++){
            for (int j=1; j<=w; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
