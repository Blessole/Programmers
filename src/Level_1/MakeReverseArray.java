package Level_1;

import java.util.*;

// 자연수 뒤집어 배열로 만들기
public class MakeReverseArray {
    public int[] solution(long n) {
        long N = n;
        int count =0;
        while (n != 0) {
            n /= 10;
            count ++;
        }

        int[] answer = new int[count];
        for (int i=0; i<answer.length; i++){
            answer[i] = (int) (N % 10);
            N /= 10;
        }

        return answer;
    }

    // 다른 사람 코드 (몇 자릿수인지 한 번에 구하기!)
    public int[] newSol(long n) {

        // 방법 1
        String a = "" + n;  // String + int = String
        int[] answer = new int[a.length()];

        // 방법 2
        int length = Long.toString(n).length();
        int[] answer1 = new int[length];

        int cnt = 0;

        while (n>0){
            answer[cnt] = (int)(n%10);
            n /= 10;
            cnt ++ ;
        }
        return answer;
    }

    // 다른사람 코드 2 (StringBuilder 이용하기)
    public int[] newSol2(long n) {
        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    }

}
