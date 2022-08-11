package Level_1;

public class NewID {
    public String solution(String new_id) {

        // 1단계
        // 모든 대문자를 소문자로 치환
        new_id = new_id.toLowerCase();

        // 2단계
        // 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.) 제외한 모든 문자 제거
        // 대괄호 속 ^ : NOT
        new_id = new_id.replaceAll("[^a-z0-9-_.]","");

        // 3단계
        // 마침표(.)가 두 개 이상 연속될 경우 하나의 마침표(.)로 치환
        // 2개 이상 : {2,} / 2개 : {2} / 2~3개 : {2,3}
        new_id = new_id.replaceAll("\\.{2,}",".");

        // 4단계
        // '.'으로 시작하거나 끝나면 치환
        // ^는 시작, $는 끝, |는 OR
        new_id = new_id.replaceAll("^(\\.)|(\\.)$","");

        // 5단계
        // new_id가 빈 문자열인 경우, "a" 대입
        if(new_id.isEmpty()) new_id="a";

        // 6단계
        // 길이가 16자 이상이면, 첫 15개 문자 제외한 나머지 문자 제거,
        // 제거 후 마침표(.)가 끝에 위치한다면 마침표(.)도 제거
        // substring(start, end) : start는 포함, end는 비포함
        if(new_id.length() >= 16) {
            new_id = new_id.substring(0,15).replaceAll("(\\.)$", "");
        }

        // 7단계
        // 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        while(new_id.length() <= 2) {
            new_id += new_id.charAt(new_id.length()-1);
        }

        return new_id;
    }
}
