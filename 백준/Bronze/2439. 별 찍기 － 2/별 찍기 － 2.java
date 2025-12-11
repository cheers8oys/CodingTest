import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int point = count-1;
        for(int i = 0; i < count; i++){ 
            for(int j = 0; j < count; j++){
                if(j >= point){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            } point--;
            System.out.println("");
        }
    }
}