import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int count = sc.nextInt();
        int[] intArrays = new int[count];
        for(int i = 0; i < count; i++){
            intArrays[i] = sc.nextInt();
        }
        int wantedNum = sc.nextInt();
        for (int i = 0; i < intArrays.length; i++){
            if (intArrays[i] == wantedNum) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}