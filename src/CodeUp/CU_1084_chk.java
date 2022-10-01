package CodeUp;

import java.io.*;
import java.util.Scanner;

// [기초-종합] 빛 섞어 색 만들기
public class CU_1084_chk {
    public static void main(String[] args) throws IOException {
        // 풀이 1 (Scanner)
        // 으악 시간 초과 남 .... 버퍼리더&버퍼라이터로 돌린다......
        Scanner sc = new Scanner(System.in);

        int l,m,n,cnt = 0;
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();

        for (l=0; l<r; l++){
            for (m=0; m<g; m++){
                for (n=0; n<b; n++){
                    System.out.printf("%d %d %d\r\n", l, m, n);
                    cnt++;
                }
            }
        }
        System.out.println(cnt);

        // 풀이 2 (BufferedReader & BufferedWriter)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] a = br.readLine().split(" ");
        int count = 0;
        for (int i=0; i<Integer.parseInt(a[0]); i++){
            for (int j=0; j<Integer.parseInt(a[1]); j++){
                for (int k=0; k<Integer.parseInt(a[2]); k++) {
                    bw.write(i+ " "+j+" "+k+"\r\n");
                    count++;
                }
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
    }
}
