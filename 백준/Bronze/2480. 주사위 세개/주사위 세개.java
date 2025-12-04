import java.util.*;
/*
10000 + 1000*똑같은 주사위 개수
1000 + 100*똑같은 주사위 개수
100* 가장 큰 주사위 수
*/
class Main {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if (a==b && b==c) {
            System.out.println(10000+(1000*a));
        }
        if ((a==b && b!=c) || (a!=b && b==c)) {
            System.out.println(1000+(100*b));
        }
        if (a==c && b!=c) {
            System.out.println(1000+(100*a));
        }                       
        if (a!=b && b!=c && a!=c ) {
            int temp = a > b? a : b;
            int max = c > temp? c : temp;
            System.out.println(100*max);
        }
    }
}