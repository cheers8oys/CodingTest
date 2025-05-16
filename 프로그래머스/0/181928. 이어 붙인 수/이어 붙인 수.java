class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String odd = "";
        String right = "";
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 0){
                right += num_list[i];
            } else{
                odd += num_list[i];
            }
        }
        
        int intOdd = Integer.parseInt(odd);
        int intRight = Integer.parseInt(right);
        
        answer = intOdd + intRight;
        return answer;
    }
}