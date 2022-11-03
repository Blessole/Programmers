package Level_2;

import java.util.Stack;

public class MatchBracket {
    boolean solution(String s) {
        int st = 0;
        int ed = 0;
        for (int i=0; i<s.length(); i++){
            if (ed > st) {return false;}
            if (s.charAt(i) == '(') st++;
            else ed++;
        }

        if (st != ed || s.startsWith(")") || s.endsWith("(")) return false;

        return true;
    }

//    다른 사람 코드
    boolean newSolution(String s) {
        boolean answer = false;
        int count = 0;
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i) == '('){
                count++;
            }
            if(s.charAt(i) == ')'){
                count--;
            }
            if(count < 0){
                break;
            }
        }
        if(count == 0){
            answer = true;
        }

        return answer;
    }

    // 다른 사람 코드
    boolean newSolution2(String s) {
        boolean answer = true;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(1);
            } else if (s.charAt(i) == ')') {
                if (st.isEmpty()) {
                    answer = false;
                    break;
                } else {
                    st.pop();
                }
            }
        }

        if(!st.isEmpty()) {
            answer = false;
        }

        return answer;
    }
}
