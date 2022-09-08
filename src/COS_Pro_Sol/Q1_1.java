package COS_Pro_Sol;

// 0을 포함하지 않은 자연수 num이 매개변수로 주어질 때, 이 수에 1을 더한 수를 return 하도록 solution 메소드를 완성해주세요.
public class Q1_1 {
    public long solution(long num) {
        num++;
        long digit = 1;

        // 숫자를 1의 자리, 10의 자리, 100의 자리 순으로 나눠가면서 나머지 구하기!
        while (num / digit % 10 == 0) {
            // num / digit < 이게 10의 배수라면 true라서 여기를 돌게 됨!
            num += digit;     // 단계별 자리 수에 0이 있는 것이므로 1/10/100 ... 을 더 해줌!
            digit *= 10;        // 나눌 단위를 10씩 곱해서 올려주기
        }
        return num;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Q1_1 sol = new Q1_1();
        long num = 9949999;
        long ret = sol.solution(num);

        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret + " .");
    }
}
