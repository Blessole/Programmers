package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 전자레인지
public class BJ_10162 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        // 내 코드
        int A = 0;
        int B = 0;
        int C = 0;
        if (T < 10 || T%10 != 0) {
            System.out.println(-1);
        }  else {
            A = T/300;
            B = (T%300)/60;
            C = ((T%300)%60)/10;
            System.out.println(A+" "+B+" "+C);
        }

        // 좀 더 멋있는 코드?
        if ( T>= 300){
            A = T/300;
            T -= 300*A;
        }
        if ( T>= 60){
            B = T/60;
            T -= 60*B;
        }
        if (T%10 != 0){
            System.out.println(-1);
            System.exit(0);
        }
        else {
            C = T/10;
            System.out.println(A+ " " + B+ " " + C);
        }
    }
}
