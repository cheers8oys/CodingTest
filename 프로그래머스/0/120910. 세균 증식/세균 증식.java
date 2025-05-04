class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        int cnt = 1;
        while (cnt <= t){
            if(cnt == 1){
              answer = n * 2;    
            } else {
                answer = answer * 2;
            }            
            cnt++;
        }
        return answer;
    }
}