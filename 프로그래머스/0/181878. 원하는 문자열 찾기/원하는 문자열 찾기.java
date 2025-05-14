class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String myStr = myString.toLowerCase();
        String patStr = pat.toLowerCase();
        
        if (myStr.indexOf(patStr) != -1){
            answer = 1;
        } else {
            answer = 0;
        }
        
        return answer;
    }
}