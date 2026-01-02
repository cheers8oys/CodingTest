import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        String str = sc.next();
        String[] strArray = str.split("");
        int sum = 0;
        for (String s : strArray){
            sum += Integer.parseInt(s);
        }
        System.out.println(sum);
    }
}