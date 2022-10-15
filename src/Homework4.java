import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int triangular = 0;
        for(int i = 1;i<=number;i++) {
            triangular = triangular + i;
        }
        System.out.println(triangular);
    }
}
