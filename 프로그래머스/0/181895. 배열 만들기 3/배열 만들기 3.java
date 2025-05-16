class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = new int[intervals[0][1]-intervals[0][0]+intervals[1][1]-intervals[1][0]+2];
        int cnt = 0;
        
        for(int i = intervals[0][0]; i <= intervals[0][1]; i++){
            answer[cnt] = arr[i];
            cnt++;
        }
        for(int j = intervals[1][0]; j <= intervals[1][1]; j++){
            answer[cnt] = arr[j];
            cnt++;
        }
        
        return answer;
    }
}