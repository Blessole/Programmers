package Level_1;

// 자릿수 더하기
public class Digits {
    public int solution(int n) {
        int answer = 0;

        for (int i=10; i<=n; ){
            answer += n%i;
            n -= answer;
            i *= 10;

        }

        // 다른 사람 풀이
        while(n != 0){
            answer += n%10;
            n /= 10;
        }

        return answer;
    }
}
