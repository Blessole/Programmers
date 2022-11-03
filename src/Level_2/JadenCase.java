package Level_2;
import java.util.*;

// JadenCase 문자열 만들기
public class JadenCase {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");

        for (int i = 0; i < str.length; i++) {
            if (str[i].length() == 0) answer += " "; // 공백일 경우 반환 값에 공백 더하기
            else {
                answer += str[i].substring(0, 1).toUpperCase();  // 첫 글자 대문자 변환
                answer += str[i].substring(1, str[i].length()).toLowerCase();   // 첫 글자 제외하고 소문자로 변환
                answer += " "; // 띄어쓰기
            }
        }

        // 원래 문자열의 마지막이 공백일 경우 그대로 answer 반환
        if (s.substring(s.length() - 1, s.length()).equals(" ")) return answer;
        // 마지막에 공백이 더해졌기 때문에, 그 공백을 제외한 answer 값 반환
        return answer.substring(0, answer.length() - 1);
    }

    // 다른 사람 코드 (삼항연산자)
    public String newSolution(String s) {
        String answer = "";
        String[] sp = s.toLowerCase().split("");
        boolean flag = true;

        for(String ss : sp){
            answer += flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ") ? true : false ;
        }

        return answer;
    }
}