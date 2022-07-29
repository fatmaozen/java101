import java.util.Scanner;

//harmonik serisini bulan program 1/1 + 1/2 + 1/n
public class ProjectB6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        double result = 0;
        System.out.println("Sayıyı giriniz: ");
        n = input.nextInt();
        for (double i = 1; i <= n; i++) {
            result += 1 / i;
        }
        System.out.println(result);
    }
}
