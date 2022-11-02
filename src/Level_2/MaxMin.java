package Level_2;

// 최댓값과 최솟값
public class MaxMin {
    public String solution(String s) {
        String[] str = s.split(" ");
        int min, max;
        min = max = Integer.parseInt(str[0]);
        for ( int i=1; i<str.length; i++){
            int n = Integer.parseInt(str[i]);
            if(min>n) min = n;
            if(max<n) max = n;
        }
        return min + " " + max;
    }
}
