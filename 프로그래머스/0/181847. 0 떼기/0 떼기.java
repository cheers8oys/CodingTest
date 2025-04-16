class Solution {
    public String solution(String n_str) {
        String str = n_str;
        String answer = str.replaceFirst("^0+", "");
        return answer;
    }
}