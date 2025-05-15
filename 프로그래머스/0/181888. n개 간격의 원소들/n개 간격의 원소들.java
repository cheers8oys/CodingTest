class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[((num_list.length-1)/n)+1];
        int cnt = 0;
        int i = 0;
        while(i < num_list.length){
            answer[cnt] = num_list[i];
            i = i + n;
            cnt++;
        }
        return answer;
    }
}