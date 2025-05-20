class Solution {
    public int solution(String number) {
        int answer = 0;
        String[] num = number.split("");
        int sum = 0;
        for(int i = 0; i < num.length; i++){
            sum += Integer.parseInt(num[i]);
        }
        answer = sum % 9;
        return answer;
    }
}