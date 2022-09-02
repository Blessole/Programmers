package Level_1;

import java.util.HashMap;
import java.util.HashSet;

// 2020 KAKAO BLIND RECRUITMENT
// 신고 결과 이메일 전송 - 각 유저가 받은 결과 메일 수 담기
public class BlackList {
    // id_list : 고객 아이디 배열
    // report : 신고 내역 배열
    // k : 신고 횟수
    public int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String, HashSet<String>> reportHash = new HashMap<String, HashSet<String>>();
        HashMap<String, Integer> count = new HashMap<String, Integer>();
        int[] answer = new int[id_list.length];
        for (String id : id_list) {
            reportHash.put(id, new HashSet<String>());
            count.put(id, 0);
        }
        for (String s : report){
            String[] str = s.split(" ");
            if(!reportHash.get(str[0]).contains(str[1])){
                int cnt = count.get(str[1]);
                count.put(str[1], cnt+1);
                reportHash.get(str[0]).add(str[1]);
            }
        }

        for(int i=0; i<id_list.length; i++){
            int cnt=0;
            for(String id : reportHash.get(id_list[i])){
                if(count.get(id)>=k){
                    cnt++;
                }
            }
            answer[i] = cnt;
        }
        return answer;
    }
}
