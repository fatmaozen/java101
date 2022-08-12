import java.util.Scanner;

public class ProjectD1 {
    static void output(int n){
        if (n > 0){
            System.out.print(n + " ");
            output(n - 5);
        }System.out.print(n +" ");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı giriniz : ");
        int a = input.nextInt();
        output(a);
    }
}
