package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// [기초-종합] 그림 파일 저장용량 계산하기
public class CU_1086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        double result = Double.parseDouble(arr[0])*Double.parseDouble(arr[1])*Double.parseDouble(arr[2]);
        System.out.printf("%.2f MB", result/8/1024/1024);
    }
}
