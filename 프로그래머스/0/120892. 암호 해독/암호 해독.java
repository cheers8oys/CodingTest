class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] codes = cipher.split(""); // 각 글자를 배열로 분리
        for(int i = 0; i < codes.length; i++){
            if((i + 1) % code == 0){ // i+1이 code의 배수일 때만
                answer += codes[i];
            }
        }
        return answer;
    }
}
