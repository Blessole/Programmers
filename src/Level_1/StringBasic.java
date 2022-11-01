package Level_1;

// 문자열 다루기 기본
public class StringBasic {
    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6 ) return false;
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) < '0' || s.charAt(i) > '9') return false;
        }
        return true;
    }

    // 다른 사람 코드 (정규표현식 사용)
    public boolean newSolution(String s) {
        if (s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");
        return false;
    }
}
