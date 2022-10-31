package Level_1;

import java.util.Arrays;
import java.util.Collections;

// 문자열 내림차순으로 배치하기
public class DescendingString {
    // 내 코드 : split으로 문자를 나눠 배열에 담은 후, Arrays.sort 이용하기 
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        Arrays.sort(str, Collections.reverseOrder());

        for(int i=0; i<s.length(); i++){
            answer += str[i];
        }
        return answer;
    }

    // 다른 사람 코드 : toCharArray() 로 문자열 나눈 후, StringBuilder로 정렬시키기
    public String reverseStr(String str){
        char[] sol = str.toCharArray();
        Arrays.sort(sol);
        return new StringBuilder(new String(sol)).reverse().toString();
    }
}
