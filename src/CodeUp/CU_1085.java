package CodeUp;

import java.io.*;
import java.util.Scanner;

// [기초-종합] 소리 파일 저장용량 계산하기
public class CU_1085 {
    public static void main(String[] args) throws IOException {
        // 내 풀이 (BufferedReader 사용 - 속도 더 빠름)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        br.close();
        double total = Double.parseDouble(arr[0])*Double.parseDouble(arr[1])*Double.parseDouble(arr[2])*Double.parseDouble(arr[3]);
        double byteT = total/8/1024/1024;
        System.out.printf("%.1f MB", byteT);


        // 다른 풀이 (Scanner 사용)
        Scanner sc = new Scanner(System.in);
        double h = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        double s = sc.nextInt();
        double result = (h*b*c*s) / 8 / 1024 / 1024;
        System.out.printf("%.1f MB", result);
    }
}
