package Level_1;

import java.util.*;

public class MBTI {
    public static String solution(String[] survey, int[] choices){
        // 점수를 구할 때 사용할 점수 Array
        int[] scoreList= {3,2,1,0,1,2,3};
        String indexString = "RTCFJMAN";

        // return할 값
        String answer="";

        // 유형(String) + 점수(Integer)랑 합쳐서 관리 > Map/HashMap 사용하기
        HashMap<Character, Integer> map = new HashMap<>();

        // map에 NullPointerException 뜨지 않도록 성격 유형 넣기
        for(int i=0; i < indexString.length(); i++){
            map.put(indexString.charAt(i), 0);
        }

        // surveyArray를 돌면서 점수를 성격유형에 맞게 추가
        for (int i=0; i< survey.length; i++) {
            // 어떤 성격 유형인지 charAt으로 구분
            char char0 = survey[i].charAt(0);
            char char1 = survey[i].charAt(1);

            // 몇 번 선택지를 선택했는지 확인
            int selectNum = choices[i];
            // 선택지에 따른 점수 확인 (1번 지표 index : 0)
            int selectScore = scoreList[selectNum - 1];

            //1~3번은 첫번째 성격유형  //4번은 둘 다 0점이라 코드 X  // 5~7은 두번째
            if (selectNum < 4) {
                map.put(char0, map.get(char0) + selectScore);
            } else if (selectNum > 4) {
                map.put(char1, map.get(char1) + selectScore);
            }
        }

        // indexString 기준으로 성격유형 확인 후, 값 확인해서 answer에 성격유형 추가
        // 2개씩 묶어서 처리해야 해서 i는 2씩 더해주기
        for (int i=0; i< indexString.length(); i+=2){
            // 성격 유형 짝에서 첫번째 성격 유형이랑 두번째 성격 유형을 구함
            char index0 = indexString.charAt(i);
            char index1 = indexString.charAt(i+1);

            // 두 성격 유형 값이 같지 않고, 두번째 성격유형 점수가 높으면 두번째 것을 추가
            // 그게 아니라면 무조건 첫번째 것 추가
            if(!Objects.equals(map.get(index0), map.get(index1)) && map.get(index0)<map.get(index1))
                answer += String.valueOf(index1);
            else
                answer += String.valueOf(index0);
        }

        return answer;
    }
}
