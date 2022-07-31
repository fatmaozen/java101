//fibonacci

import java.util.Scanner;

public class ProjectC3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Eleman sayısını giriniz: ");
        int n = input.nextInt();
        int a = 0, b = 1, c;
        for (int i = 0; i <= n; i++) {
            c = a + b;
            System.out.println(a + "+" + b + "=" + c);
            a = b;
            b = c;
        }
    }
}
