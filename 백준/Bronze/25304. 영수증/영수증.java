import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int totalPrice = sc.nextInt();
        int totalCount = sc.nextInt();
        int sum = 0;
        
        for (int i = 0; i < totalCount; i++){
            int price = sc.nextInt();
            int count = sc.nextInt();
            sum += price*count;
        }
        
        if (totalPrice == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
}