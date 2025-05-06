class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String sa = Integer.toString(a);
        String sb = Integer.toString(b);
        String sab = sa + sb;
        int ab = Integer.parseInt(sab);
        
        if (ab < 2*a*b){
            answer = 2*a*b;
        } else{
            answer = ab;
        }
        return answer;
    }
}