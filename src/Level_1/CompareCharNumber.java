package Level_1;

// 문자열 내 p와 y의 개수
public class CompareCharNumber {
    boolean solution(String s) {
        int pCount = 0, yCount = 0;
        // String을 하나씩 끊어서 배열에 넣는 방법
        String[] array = s.toLowerCase().split("");

        for(int i=0; i<array.length; i++){
            if("p".equals(array[i])){
                pCount++;
            } else if ("y".equals(array[i])){
                yCount++;
            }
        }
        if (pCount != yCount)  {
            return false;
        }
        return true;
    }

    // 다른 사람 풀이
    boolean newSol(String s){
        s = s.toLowerCase();
        int count = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'p')
                count++;
            else if(s.charAt(i) == 'y')
                count--;
        }

        return count == 0;
    }
}
