package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// [기초-입출력] 정수 1개 입력받아 나누어 출력하기
public class CU_1025 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();
        char[] arr = number.toCharArray();
        int k=arr.length-1;
        for( int i = 0; i < arr.length; i++){
            System.out.println("[" + (arr[i]-'0')*(int)Math.pow(10, k) + "]");
            k--;
        }
    }
}
