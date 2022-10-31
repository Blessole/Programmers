package Level_1;

import java.util.*;
import java.lang.*;

//
public class GetMiddleLetter {

    // 내 코드 : split으로 배열에 넣기
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        int a = s.length()/2;
        if (s.length()%2 == 0) {
            answer = str[a-1]+str[a];
        } else {
            answer = str[a];
        }
        return answer;
    }

    // 다른 사람 코드 :  substring 이용하기
    public String newSolution(String word) {
        int a = word.length();
        String word1;
        if (a%2 == 0){
            word1 = word.substring(a/2 - 1, a/2 + 1);
        } else {
            word1 = word.substring(a/2, a/2 +1);
        }
        return word1;
    }

    // 다른 사람 코드 2 : substring + 삼항 연산자
    public String newSolution2(String word){
        int a = word.length();
        int mid = a/2;
        return a%2==0?word.substring(mid-1,mid+1):word.substring(mid,mid+1);
    }
}