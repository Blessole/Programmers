package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

// [기초-입출력] 시간 입력받아 그대로 출력하기
public class CU_1018_chk {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // 첫번째 방법 : 입력 전체를 String으로 받아 출력하기
        String time = scanner.next();
        System.out.printf("%s", time);

        // 두번째 방법 : ":"를 구분자로 삼고, int형 변수 두 개로 저장 후 출력하기 (StringTokenizer)
        StringTokenizer st = new StringTokenizer(time, ":");
        int[] arr = new int[st.countTokens()];
        for (int i = 0; st.hasMoreTokens(); i++){
            // 리턴 값이 String이라 형변환 해줌
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(arr[0] + ":" + arr[1]);

        // BufferedReader 이용해보기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine(), ":");
        int[] arr1 = new int[st1.countTokens()];
        for (int i = 0; st1.hasMoreTokens(); i++){
            arr1[i] = Integer.parseInt(st1.nextToken());
        }
        System.out.println(arr1[0]+":"+arr1[1]);

    }
}
