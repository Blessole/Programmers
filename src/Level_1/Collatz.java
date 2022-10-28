package Level_1;

// 콜라츠 추측
public class Collatz {

    // 1차 시도 실패 ( testcase3 : '-1' 반환해야 하는 경우 실패 )
    // 원인 : num이 626331인 경우, 계산 중에 int 자료형의 범위를 초과함 > int num 을 long n 으로 다시 받아줘야 함
    // 개선점 : 1. 일단 중복된 코드를 줄여야 한다. 'num == 1' 부분 줄일 수 있었잖아!
    //             2. 접근 방식은 좋았는데, 조금 더 간단하게 생각할 필요가 있다. 너무 복잡하게 생각함
    public int solution(int n) {
        long num = n;   // 2차시도에서 이걸 넣어줘서 성공함

        int cnt = 0;
        if (num == 1) {
            return 0;
        } else {
            while (true) {
                if (num % 2 == 0) {
                    num /= 2;
                } else {
                    num = (num * 3) + 1;
                }
                cnt++;

                if (num == 1) {
                    break;
                } else if (cnt >= 500) {
                    cnt = -1;
                    break;
                }
            }
            return cnt;
        }
    }

    // 다른 사람 코드 (내 코드랑 방식은 비슷하지만 더 깔끔함)
    public int newSolution(int n) {
        long num = n;
        int answer = 0;

        while (num != 1){
            if (num%2 ==0){
                num /= 2;
            } else {
                num = num * 3 + 1;
            }
            answer ++;

            if(answer == 500) {
                answer = -1;
                break;
            }
        }
        return answer;
    }

    // 다른 사람 코드 2 (for문 & 삼항식 활용)
    public int newSolution2(int n) {
        long num = n;
        for(int i=0; i<500; i++){
            if (n==1) return i;
            n = (n%2==0) ? n/2 : n*3+1;
        }
        return -1;
    }
}
