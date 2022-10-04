package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// [기초-2차원배열] 성실한 개미
public class CU_1099_chk {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[][] = new int[11][11];

        for (int i=1; i<11; i++){
            String a = br.readLine();
            String b[] = a.split(" ");
            for (int j=0; j<10; j++){
                arr[i][j+1] = Integer.parseInt(b[j]);
            }
        }
        int x=2;
        int y=2;

        while (true) {
            if (arr[x][y] == 0) {
                arr[x][y] =9;
                y++;
            }

            if (arr[x][y] == 1){
                y--;
                x++;
            }

            if (arr[x][y] == 2){
                arr[x][y] = 9;
                break;
            } else if (arr[x][y+1] ==1 && arr[x+1][y] ==1){
                if(arr[x][y] == 0)
                    arr[x][y] =9;
                break;
            }
        }
        for (int i=1; i<=10; i++){
            for (int j=1; j<=10; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
