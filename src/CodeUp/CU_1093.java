package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

// [기초-1차원배열] 이상한 출석 번호 부르기1
public class CU_1093 {
    public static void main(String[] args) throws IOException {
        // 내 풀이
        // 버퍼는 엔터까지 읽어온다! 나는 객체를 두 번 생성했지만 ㅠ
        // > for문으로 readLine 돌려서 여러 줄 출력하기 가능
        // for (int i=0; i<횟수; i++){ s[i]=br.readLine();} 이런식
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int[] arr = new int[23];
        for (int i=0; i<n; i++){
            arr[Integer.parseInt(st2.nextToken())-1] ++;
        }

        for(int j=0; j<arr.length; j++) {
            System.out.print(arr[j]+" ");
        }

        // 다른 사람 풀이
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] arr1 = new int[23];
        for (int i=0; i<n1; i++){
            arr1[sc.nextInt()-1] ++;
        }

        for(int j=0; j<arr1.length; j++) {
            System.out.print(arr[j]+" ");
        }
    }
}
