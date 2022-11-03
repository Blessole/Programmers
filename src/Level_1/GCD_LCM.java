package Level_1;

// 최대공약수, 최소공배수
public class GCD_LCM {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        for (int i = 1; i <= n && i <= m; i++) {
            if (n % i == 0 && m % i == 0) {
                answer[0] = i;
                answer[1] = n * m / answer[0];
            }
        }
        return answer;
    }

    // 다른 사람 코드 (재귀함수 활용)
    public int[] newSolution(int a, int b) {
        int[] answer = new int[2];

        answer[0] = gcd(a,b);
        answer[1] = (a*b)/answer[0];
        return answer;
    }
    public static int gcd(int p, int q) {
        if (q == 0) return p;
        return gcd(q, p%q);
    }


}
