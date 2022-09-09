package COS_Pro_Sol;

public class Q1_2 {
    public int solution(int n) {
        int[][] pane = new int[n][n];

        int print;
        int min=1;        // 배열에 들어갈 첫 숫자
        int max = n*n; //배열의 마지막 숫자
        int width = n;  //가로 최대 범위
        int length = n-1;   // 세로 최대 범위
        int i=0; int j=0;

        while(min <= max){
            for(int k=1; k<=width; k++){
                pane[i][j] = min;
                j++;
                min++;
            }
            width--;
            i++;
            j--;

            for(int k=1; k<=length; k++){
                pane[i][j] = min;
                i++;
                min++;
            }
            length--;
            i--;
            j--;

            for(int k=1; k<=width; k++){
                pane[i][j]=min;
                j--;
                min++;
            }
            width--;
            i--;
            j++;

            for(int k=1; k<=length; k++){
                pane[i][j]=min;
                i--;
                min++;
            }
            length--;
            i++;
            j++;
        }
        int answer = 0;
        for(int s=0; s<n; s++){
            answer += pane[s][s];
        }
        return answer;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Q1_2 sol = new Q1_2();
        int n1 = 3;
        int ret1 = sol.solution(n1);


        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret1 + " .");

        int n2 = 2;
        int ret2 = sol.solution(n2);

        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret2 + " .");
    }
}
