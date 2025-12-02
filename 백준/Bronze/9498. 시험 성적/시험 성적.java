import java.util.*;

class Main {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        
        if (100 >= score && score >= 90) {
            System.out.println("A");
        }
        if (90 > score && score >= 80) {
            System.out.println("B");
        }
        if (80 > score && score >= 70) {
            System.out.println("C");
        }
        if (70 > score && score >= 60) {
            System.out.println("D");
        }
        if (score < 60) {
            System.out.println("F");
        }
    }
}


//90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F