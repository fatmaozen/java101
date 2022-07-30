import java.util.Scanner;
//max\min
public class ProjectB9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 1, min = 1;
        System.out.println("Kaç sayı gireceksiniz?");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i + ". sayıyı girin: ");
            int number = input.nextInt();
            if (i == 1) {
                max = number;
                min = number;
            }
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println("Girilen en büyük sayı " + max);
        System.out.println("Girilen en küçük sayı " + min);


    }
}
