class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String numbers = my_string.replaceAll("[^0-9]", "");
        int[] num = new int[numbers.length()];
        for (int i = 0; i < numbers.length(); i++) {
            num[i] = numbers.charAt(i) - '0'; // 문자 → 숫자 변환
            answer += num[i];
        }
        return answer;
    }
}