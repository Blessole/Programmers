package Level_1;

import java.util.stream.IntStream;

// 내적
public class InnerProduct {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i=0; i<a.length; i++){
            answer += a[i]*b[i];
        }
        return answer;
    }

    // 다른 사람 코드 : IntStream 사용
    public int newSolution(int[] a, int[] b){
        return IntStream.range(0, a.length).map(index -> a[index] * b[index]).sum();
    }
}
