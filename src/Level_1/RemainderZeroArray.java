package Level_1;

import java.util.ArrayList;
import java.util.Arrays;

// 나누어 떨어지는 숫자 배열
public class RemainderZeroArray {

    // ArrayList를 이용하는 방법(add, get)
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> a1 = new ArrayList<Integer>();

        for(int i=0; i<arr.length; i++){
            if (arr[i]%divisor == 0) {
                a1.add(arr[i]);
            }
        }

        if(a1.isEmpty()){
            a1.add(-1);
        }

        answer = new int[a1.size()];

        for(int i=0; i<a1.size(); i++){
            answer[i] = a1.get(i);
        }
        Arrays.sort(answer);

        return answer;
    }

    // 다른 사람 코드 (Arrays.stream())
    public int[] newSolution(int[] arr, int divisor) {
        // Arrays.stream(array, int a1, int a2) : a1부터 (a2 -1)까지 요소를 가져옴
        // filter : 조건 걸기 (element는 이름 아무거나 넣어줘도 상관X)
        int[] answer = Arrays.stream(arr).filter(element -> element%divisor==0).toArray();
        if(answer.length == 0) answer = new int[] {-1};
        Arrays.sort(answer);
        return answer;
    }
}
