import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int num = sc.nextInt();
        
        int[] array = new int[cnt];
        for(int i = 0; i < num; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            for(int j = a-1; j <= b-1; j++){
                array[j] = c;
            }
        }
        for(int k = 0; k < array.length; k++){
            System.out.println(array[k]);
        }
    }
}