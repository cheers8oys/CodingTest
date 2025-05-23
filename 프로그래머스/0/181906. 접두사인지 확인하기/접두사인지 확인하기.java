class Solution {
    public int solution(String my_string, String is_prefix){
        int answer = 0;
        int cnt = 0;
        for(int i = 0; i < is_prefix.length(); i++){
            if (i >= my_string.length()) {
                return 0;
            }
            if(my_string.charAt(i) == is_prefix.charAt(i)){
                cnt++;
            } else {
                return 0;
            }
        }
        if (cnt == is_prefix.length()){
            answer = 1;
        }
        return answer;
    }
}