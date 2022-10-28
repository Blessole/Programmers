package Level_1;

// 문자열을 정수로 바꾸기
public class StringToInt {
    public int solution(String s) {
        int answer = Integer.parseInt(s);
        return answer;
    }

    // 다른 사람 풀이 (Integer.parseInt를 풀어 쓴 것)
    public int newSolution(String s) {
        boolean sign = true;
        int result = 0;

        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (ch == '-')
                sign = false;
            else if (ch != '+')
                result = result*10 + (ch - '0');
        }

        return (sign ? 1 : -1) * result;
    }
}
