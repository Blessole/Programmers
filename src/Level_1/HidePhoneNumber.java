package Level_1;

import java.util.Arrays;
import java.util.Collections;

// 핸드폰 번호 가리기
public class HidePhoneNumber {

    // Java 함수가 정말 다양하다는 걸 느낌...
    public String solution(String phone_number) {
        String answer = "";

        String[] arr = phone_number.split("");
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 4) {
                arr[i] = "*";
            }
            answer += arr[i];
        }
        return answer;
    }

    // 다른 사람 코드 (toCharArray 를 활용하기!)
    // char[] 는 String.valueOf()로 씌워주면 String으로 반환함! 멋져..
    public String newSolution(String phone_number) {
        char[] ch = phone_number.toCharArray();
        for (int i=0; i<ch.length -4; i++){
            ch[i] = '*';
        }
        return String.valueOf(ch);
    }
}