import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        // 1. 숫자만 추출
        String numbers = my_string.replaceAll("[^0-9]", "");
        
        // 2. 문자 배열로 변환 후 정수 배열 생성
        int[] answer = new int[numbers.length()];
        for (int i = 0; i < numbers.length(); i++) {
            answer[i] = numbers.charAt(i) - '0'; // 문자 → 숫자 변환
        }
        
        // 3. 오름차순 정렬
        Arrays.sort(answer);
        
        return answer;
    }
}
