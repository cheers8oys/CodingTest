class Solution {
    public int solution(int n) {
        int answer = 0;
        while (n > 0) {
            answer += n % 10; // 1의 자리 더하기
            n = n / 10;       // n을 10으로 나눠서 자리수 줄이기
        }
        return answer;
    }
}
