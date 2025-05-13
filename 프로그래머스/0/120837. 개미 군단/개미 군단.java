class Solution {
    public int solution(int hp) {
        int answer = 0;
        int count5 = hp / 5;
        hp = hp % 5;
        int count3 = hp / 3;
        hp = hp % 3;
        
        answer = count5 + count3 + hp;
        
        return answer;
    }
}