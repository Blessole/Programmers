package Level_1;
import java.lang.*;

// 이상한 문자 만들기
public class StrangeString {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");

        int idx = 0;
        for (int i = 0; i < s.length(); i++) {
            if (arr[i].equals(" ")) {
                idx = 0;
            } else if (idx % 2 == 0) {
                arr[i] = arr[i].toUpperCase();
                idx++;
            } else if (idx % 2 != 0) {
                arr[i] = arr[i].toLowerCase();
                idx++;
            }
            answer += arr[i];
        }
        return answer;
    }

    // 다른 사람 코드(향상된 for문 + 삼항)
    public String newSolution(String s) {
        String answer = "";
        String[] arr = s.split("");
        int cnt = 0;

        for (String ss : arr){
            cnt = ss.contains(" ") ? 0 : cnt+1;
            answer += (cnt%2==0)?ss.toLowerCase() : ss.toUpperCase();
        }
        return answer;
    }
}