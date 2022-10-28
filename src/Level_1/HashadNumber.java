package Level_1;

// 하샤드 수
public class HashadNumber {
    public boolean solution(int x) {
        String a = ""+x;
        String[] arr = a.split("");

        int sum = 0;
        int i=0;
            while ( i < a.length()){
            sum += Integer.parseInt(arr[i]);
            i++;
        }
            return x%sum ==0;
    }

    // 다른 사람 코드 (향상된 for문 사용)
    public boolean newSol(int x) {
        String[] temp = String.valueOf(x).split("");

        int sum=0;
        for(String s : temp){
            sum += Integer.parseInt(s);
        }

        return x % sum == 0;
    }
}
