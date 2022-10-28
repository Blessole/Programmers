package Level_1;

import java.util.*;

// 정수 내림차순으로 배치하기
public class DescendingOrder {
    public long solution(long n) {
        String[] str = String.valueOf(n).split("");
        Arrays.sort(str, Collections.reverseOrder());

        String answer = "";
        for(int i=0; i<str.length; i++){
            answer += str[i];
        }

        return Long.valueOf(answer);
    }

    // 다른 사람 코드 (StringBuilder 사용)
    public long newSolution(long n) {
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();
        for(String aList : list) sb.append(aList);

        return Long.parseLong(sb.reverse().toString());
    }
}
