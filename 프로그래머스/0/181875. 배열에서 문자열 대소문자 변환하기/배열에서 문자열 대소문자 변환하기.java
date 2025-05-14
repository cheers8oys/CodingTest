class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        
        int cnt = 0;
        for(int i = 0; i < strArr.length; i++){
            if(i == 0 || i % 2 == 0){
                answer[cnt] = strArr[i].toLowerCase();
                cnt++;
            } else{
                answer[cnt] = strArr[i].toUpperCase();
                cnt++;
            }
        }
        return answer;
    }
}