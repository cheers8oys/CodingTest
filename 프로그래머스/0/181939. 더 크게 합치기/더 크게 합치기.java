class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String sa = Integer.toString(a);
        String sb = Integer.toString(b);
        
        String sab = sa+sb;
        String sba = sb+sa;
        
        int iab = Integer.parseInt(sab);
        int iba = Integer.parseInt(sba);
        
        if(iab > iba){
            answer = iab;
        } else{
            answer = iba;
        }
        return answer;
    }
}