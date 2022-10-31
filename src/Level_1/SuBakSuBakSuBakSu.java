package Level_1;

// 수박수박수박수박수박수?
public class SuBakSuBakSuBakSu {
    public String solution(int n) {
        String answer = "";
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                answer += "박";
            } else {
                answer += "수";
            }
        }
        return answer;
    }

    // 다른 사람 코드 (삼항연산자)
    public String newSolution(int n) {
        String result = "";
        for(int i=0; i<n; i++) {
            result += i%2==0? "수":"박";
        }
        return result;
    }

    // 다른 사람 코드 2 : char[], replace, substring 이용하기
    // 빈 char[]는 \0으로 먼저 생성된다
    // n/2 + 1 : 길이는 1부터 시작 이라는 말
    public String watermelon(int n){

        return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);
    }
}