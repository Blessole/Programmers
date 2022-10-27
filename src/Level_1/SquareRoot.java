package Level_1;

import java.util.*;

// 제곱근 구하기
public class SquareRoot {
    public long solution(long n) {
        long answer = 0;
        int root = (int) Math.sqrt(n);

        if (Math.pow(root,2) != n){
            answer = -1;
        } else {
            answer = (long) Math.pow(root+1, 2);
        }
        return answer;
    }

    // 다른 사람 풀이
    public long newSol(long n){
        if (Math.pow((int)Math.sqrt(n), 2) == n){
            return (long)Math.pow(Math.sqrt(n)+1, 2);
        }
        return -1;
    }

    // 다른 사람 풀이 2
    public long newSol2(long n){
        double i = Math.sqrt(n);

        // floor : 내림 (소수점 자리 없앰)
        // 제곱근이 아니라면 i 가 0.xxx 이기 때문에 i랑 비교하면 틀릴 수 밖에 없음
        return Math.floor(i) == i ? (long)Math.pow(i+1, 2) : -1;
    }
}
