package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// [기초-종합] 함께 문제 푸는 날
public class CU_1092 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int day = 1;
        while (day%a !=0 || day%b != 0 || day%c != 0) {     // 누구든 들어오는 날이 아닐 수 있는 경우 -> day++;
            if (day%a == 0 && day%b == 0 && day%c == 0){    // 셋 다 들어오는 날인 경우 -> break~!
                break;
            }
            day++;
        }
        System.out.println(day);
    }
}
