package Level_2;

import java.util.*;
import java.lang.*;

// 이진 변환 반복하기
public class RepeatBinary {

    // 결과가 너무 길게 나온다고 짧게 줄이라고 함 ..ㅠ 왜지..
    public int[] solution(String s) {
        int[] answer = new int[2];
        int count = 0;
        int zero = 0;
        while (!s.equals("1")) {
            for(int i=0; i<s.length(); i++){
                if (s.charAt(i) == '0') zero++;
            }
            s = Integer.toBinaryString(s.length()-zero);
            count++;
        }

        answer[0] = count;
        answer[1] = zero;
        return answer;
    }

    // 다른 사람 코드
    // count_one를 int로 선언해준 후 계산 똑같이 했더니 정상적으로 작동됨 ..
    public int[] newSolution(String s) {
        int[] answer = new int[2];
        int count = 0;
        int zero = 0;
        while (!s.equals("1")) {
            int count_one = 0;
            for(int i=0; i<s.length(); i++){
                if (s.charAt(i) == '0') zero++;
                else count_one++;
            }
            s = Integer.toBinaryString(count_one);
            count++;
        }

        answer[0] = count;
        answer[1] = zero;
        return answer;
    }
}
