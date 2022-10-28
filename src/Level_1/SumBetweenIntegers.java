package Level_1;

// 두 정수 사이의 합
public class SumBetweenIntegers {

    public long solution(int a, int b) {
        long answer = 0;

        if (a != b ) {
            int small = Math.min(a, b);
            int big = Math.max(a,b);

            for (int i=small; i<=big; i++){
                answer += i;
            }
        } else answer = a;
        return answer;
    }

    // 다른 사람 코드 (등차수열의 합 공식 이용하기)
    // 등차수열의 합 = 개수 * 평균
    //                     = n * ( a + b ) / 2
    public long newSolution(int a, int b) {
        return sumAtoB(Math.min(a,b), Math.max(a,b));
    }
    private long sumAtoB(long a, long b){
        return (b - a + 1) * (a + b) / 2;
    }

    // 다른 사람 코드 2 (삼항연산자 이용하기)
    // 나랑 방식은 비슷하지만, 코드가 좀 더 짧고 간결
    public long newSolution2(int a, int b) {
        long answer = 0;
        for (int i= ((a < b) ? a : b); i<=((a < b) ? b : a); i++){
            answer += i;
        }
        return answer;
    }
}

