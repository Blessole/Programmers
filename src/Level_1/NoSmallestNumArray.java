package Level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

// 제일 작은 수 제거하기
public class NoSmallestNumArray {

    // 가장 작은 수 찾기 위해 변수:min 을 초기화
    // 순서대로 탐색 후 더 작은 수 찾으면 min을 해당 인덱스 번호로 수정
    // 가장 작은 수의 인덱스번호를 제외한 다른 수를 새로운 배열에 담기
    public int[] solution(int[] arr) {
        if(arr.length == 1) return new int[]{-1};

        int min = Integer.MAX_VALUE;
        for(int a : arr){
            if(min > a) min = a;
        }

        int[] newArr = new int[arr.length-1];
        int index = 0;
        for (int a : arr) {
            if (min != a) newArr[index++] = a;
        }
        return newArr;
    }

    //  다른 사람 코드 (Arrays 이용)
    // 배열을 순서대로 탐색하며 리스트에 담는다. 이 때 가장 작은 수를 찾아 min 에 저장해둔다.
    // 가작 작은 수를 제거 후 리스트를 배열로 변환해 반환한다.
    public int[] newSolution(int[] arr) {
        if(arr.length <= 1) return new int[] {-1};

        // 배열을 리스트로 변환하면서 가장 작은 수 찾기
        int min = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++) {
            list.add(arr[i]);
            if(min > arr[i]) min = arr[i];
        }

        // 가장 작은 수 제거 후 리스트를 새로운 배열로 변환
        list.remove(list.indexOf(min));
        int[] newArr = new int[list.size()];
        for(int i=0; i<newArr.length; i++) newArr[i] = list.get(i);

        return newArr;
    }

    //  다른 사람 코드 (Stream 이용)
    // min() 메소드를 통해 가장 작은 수를 찾는다.
    // filter() 를 통해 가장 작은 수를 제외한 나머지를 탐색한다.
    public int[] newSolution2(int[] arr) {
        if(arr.length == 1) return new int[]{-1};

        int min = IntStream.of(arr).min().getAsInt();
        return IntStream.of(arr).filter(i -> i != min).toArray();
    }
}
