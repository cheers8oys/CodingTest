class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        
        int cnt = 0;
        int count = 0;
        
        for(int i = 0; i < finished.length; i++){
            if(finished[i] == false){
                cnt++;
            }
        }
        String[] answer = new String[cnt];
        
        for(int i = 0; i < todo_list.length; i++){
            for(int j = 0; j < finished.length; j++){
                if( i == j && finished[j] == false){
                    answer[count] = todo_list[i];
                    count++;
                }
            }
        }
        return answer;
    }
}