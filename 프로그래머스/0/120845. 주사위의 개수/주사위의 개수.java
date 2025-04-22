class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int 가로 = (int)(box[0] / n);
        int 세로 = (int)(box[1] / n);
        int 높이 = (int)(box[2] / n);
        
        answer = 가로*세로*높이;
 
        return answer;
    }
}