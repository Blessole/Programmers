package CodeUp;

import java.util.Scanner;
import java.util.StringTokenizer;

// [기초-종합] 원하는 문자가 입력될 때까지 반복 출력하기
public class CU_1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 내 풀이
        StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
        char[] arr = new char[st.countTokens()];
        for (int i=0; i<arr.length; i++){
            arr[i] = st.nextToken().charAt(0);
            System.out.println(arr[i]);
            if (arr[i] == 'q') {
                break;
            }
        }

        // do while문도 사용해볼까?
        do{
            char a = sc.next().charAt(0);
            System.out.println(a);
            if(a == 'q') break;
        } while(true);

        // 다른 사람 풀이 (while문)
        while (true) {
            char a = sc.next().charAt(0);
            System.out.println(a);
            if(a=='q'){
                break;
            }
        }
    }
}
