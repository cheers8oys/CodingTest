import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] students = new int[31];
        
        // 제출한 학생 표시
        for (int i = 0; i < 28; i++) {
            int num = sc.nextInt();
            students[num] = 1;
        }
        
        // 미제출자 출력
        for (int i = 1; i <= 30; i++) {
            if (students[i] != 1) {
                System.out.println(i);
            }
        }
        
        sc.close();
    }
}
