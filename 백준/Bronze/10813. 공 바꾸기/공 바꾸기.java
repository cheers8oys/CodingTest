import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ea = sc.nextInt();
        int count = sc.nextInt();
        
        int[] array = new int[ea];
        for(int i = 0; i < ea; i++){
            array[i] = i+1;
        }
        for(int j = 0; j < count; j++){
            int index1 = sc.nextInt()-1;
            int index2 = sc.nextInt()-1;
            int temp = 0;
            
            temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;         
        }
        for(int k = 0; k < array.length; k++){
            System.out.print(array[k]+" ");
        }
    }
}