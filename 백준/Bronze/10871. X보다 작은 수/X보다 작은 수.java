import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int num = sc.nextInt();
        int[] intArrays = new int[count];
        for(int i = 0; i < count; i++){
            intArrays[i] = sc.nextInt();
        }
        for(int i = 0; i < intArrays.length; i++){
            if (intArrays[i] < num){
                System.out.print(intArrays[i]+" ");
            }
        }
    }
}