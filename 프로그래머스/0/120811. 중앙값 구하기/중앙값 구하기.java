import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        for(int i = 0; i < array.length; i++){
            if (array.length % 2 != 0){
                if(i == ((array.length-1)/2)){
                    answer = array[i];
                }
            }else{
                if(i == (array.length/2)+1){
                    answer = array[i];
                }
            }
        }
        return answer;
    }
}