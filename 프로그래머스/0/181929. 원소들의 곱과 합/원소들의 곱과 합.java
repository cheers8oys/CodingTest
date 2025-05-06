class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int multiple = num_list[0];
        int sum = num_list[0];
        for(int i = 1; i < num_list.length; i++){
            sum = sum + num_list[i];
            multiple = multiple * num_list[i];
            
            if (multiple < sum * sum) {
                answer = 1;
            } else {
                answer = 0;
            }
        }
        return answer;
    }
}