import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] array = new int[9];
        
        int i = 0;
        while(sc.hasNext()){
            array[i] = sc.nextInt();
            i++;
        }
        
        int[] array2 = Arrays.copyOf(array, array.length);
        
        int index = 0;
        Arrays.sort(array2); 
        
        for(int j = 0; j < array.length; j++){
            if(array[j] == array2[8]){  
                index = j + 1; 
            }
        }
        
        System.out.println(array2[8]);
        System.out.println(index);      
    }
}