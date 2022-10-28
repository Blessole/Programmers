package Level_1;

// x만큼 간격이 있는 n개의 숫자
public class GapX {

    // 1차시도 (테스트 2개 실패)
    // 원인 : long으로 형변환 안하면 int 범위를 벗어나는 숫자들이 음수가 되버리는 결과
    // 해결법 : 파라미터에 int x를 long x 로 변경하기
    public long[] solution(int x, int n) {
        // 배열 수  n
        long[] answer = new long[n];
        for (int i=0; i < n; i++) {
            answer[i] = x*(i+1);
        }
        return answer;
    }

    // 2차시도 성공(했지만 코드 별로 맘에 안 듦)
    public long[] secondSolution(int x, int n) {
        // 배열 수  n
        long[] answer = new long[n];

        long num = x;       // long 으로 해야 함 주의 !!
        for (int i=0; i < n; i++) {
            answer[i] = num;
            num += x;
        }

        return answer;
    }

    // 다른 사람 풀이 (깔-끔)
    public long[] newSolution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;

        for (int i=1; i<n; i++){
            answer[i] = answer[i-1] + x;
        }
        return answer;
    }

}
