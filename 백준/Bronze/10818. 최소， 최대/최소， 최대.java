import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] intArrays = new int[count];
        for(int i = 0; i < count; i++){
            intArrays[i] = sc.nextInt();
        }
        Arrays.sort(intArrays);
        System.out.println(intArrays[0]+" "+intArrays[count-1]);
    }
}