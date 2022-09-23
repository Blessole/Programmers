package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// [기초-입출력] 단어 1개 입력받아 나누어 출력하기
public class CU_1024 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        for (int i=0; i<word.length(); i++){
            System.out.printf("\'%c\'\r\n", word.charAt(i));
        }
    }
}
