package Level_1;

// 약수 구하기
// 약수 : 나눴을 때 나머지가 0인 수
public class Divisor {
    public int solution(int n) {
        int answer = 0;

        for (int i=1; i<=n; i++){
            if (n%i == 0){
                answer += i;
            }
        }

        return answer;
    }

    // 다른 사람 풀이
    // for 문을 돌릴 때 절반까지만 돌려도 된다! (i<=n/2)
    // 모든 약수 : 1, ... , n/2, n 이기 때문
}
