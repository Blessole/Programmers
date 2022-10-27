package Level_1;

import java.util.Arrays;

// 평균 구하기
public class Average {
    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        for (int i=0; i <arr.length; i++){
            sum += arr[i];
        }
        answer = sum/arr.length;
        return answer;
    }

    // 다른 사람 풀이
    public double newSol(int[] arr){
        return (double) Arrays.stream(arr).average().orElse(0);
    }
}
