package Level_1;

import java.util.Arrays;

// 없는 숫자 더하기
public class PlusNoNumber {

    // 제발 어렵게 풀려고 하지말자... 단순히 생각해보자
    // 숫자 배열을 따로 만들어서 포함여부 확인하기
    public int solution(int[] numbers){
        int answer = 0;
        int[] sum = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (sum[i] == numbers[j]) {
                    sum[i] -= numbers[j];
                }
            }
            answer += sum[i];
        }
        return answer;
    }

    // 간단 풀이
    // 총 합에서 빼주면 됨...
    public int newSolution(int[] numbers) {
        int answer = 45;
        for (int n: numbers){
            answer -= n;
        }
        return answer;
    }

    // 포함 여부 확인해서 풀기
    public int newSolution2(int[] numbers){
        int answer = 0;
        for(int i=0; i<10; i++){
            if (!contains(numbers,i)){
                answer += i;
            }
        }
        return answer;
    }
    public boolean contains(int[] arr, int key){
        return Arrays.stream(arr).anyMatch(i -> i==key);
    }
}
