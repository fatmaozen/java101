import java.util.Scanner;

public class ProjectC9 {
    static int prime(int a) {
        int count = 0;

        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println(a + " Asal bir sayıdır.");
        } else {
            System.out.println(a + " Asal bir sayı değildir.");
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        int a = input.nextInt();
        prime(a);


    }
}
