class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        boolean isEvenLength = arr.length % 2 == 0;

        for(int i = 0; i < arr.length; i++) {
        
            if ((isEvenLength && i % 2 == 1) || 
                (!isEvenLength && i % 2 == 0)) {
                answer[i] = arr[i] + n;
            } else {
                answer[i] = arr[i];
            }
        }
        return answer;
    }
}
