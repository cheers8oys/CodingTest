import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minutes = sc.nextInt();
    
        if (minutes < 45){
            hour = hour - 1;
            minutes = minutes + 60 - 45;
            if (hour < 0){
                hour = 23;
            }        
        } else {
            minutes = minutes - 45;   
        }
        
        System.out.println(hour+" "+minutes);
    }
}
