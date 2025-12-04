import java.util.*;

class Main {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int time = sc.nextInt();
        
        int totalHour = hour*60 + minute + time;
        hour = totalHour / 60;
        if (hour > 23) {
            hour = hour % 24;
        }
        minute = totalHour % 60;
        
        System.out.println(hour+" "+minute);
           
    }
}