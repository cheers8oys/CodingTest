import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int answer = 0;
        int cnt = 0;
        int multiple = 0;
        int max = 0;
        for (int i = 0; i < numbers.length; i++){
            if(i == cnt){
                continue;
            }
            multiple = numbers[cnt] * numbers[i];
            if(max < multiple){
                max = multiple;
                answer = max;
            }
            cnt++;
        }
        return answer;
    }
}