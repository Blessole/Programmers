package Level_1;

import java.util.Arrays;

// 서울에서 김서방 찾기
public class FindKim {
    public String solution(String[] seoul) {
        int i=0;
        while(i<seoul.length){
            if (seoul[i].equals("Kim")) break;
            i++;
        }
        return "김서방은 " + i + "에 있다";
    }

    // 다른 사람 코드 (Arrays. 이용하는 방법)
    public String newSolution(String[] seoul) {
        int x = Arrays.asList(seoul).indexOf("Kim");

        return "김서방은 " + x + "에 있다";
    }

}