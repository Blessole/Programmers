package Level_1;

// 음양 더하기
public class CombinationPlusMinus {

    // 내 코드
    // 굳이 마이너스를 앞에 붙여준게 너무 더럽다 ㅠ
    // boolean 타입을 활용하는 방법이 정말 무궁무진하다.. 생각하고 풀자
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i] == false) {
                absolutes[i] = -absolutes[i];
            }
            answer += absolutes[i];
        }
        return answer;
    }

    // 다른 사람 코드 (boolean을 바로 if문에서 이용하기)
    public int newSolution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }
        return answer;
    }

    // 다른 사람 코드 (삼항식 이용)
    public int newSolution2(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i=0; i<signs.length; i++)
            answer += absolutes[i] * (signs[i]? 1: -1);
        return answer;
    }
}