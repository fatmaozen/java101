import java.util.Scanner;
//üs alma
public class ProjectB3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, total = 1;
        System.out.println("sayı:");
        a = input.nextInt();
        System.out.println("üs:");
        b = input.nextInt();
        for (int i=1;i<=b;i++){
            total*=a;
        }
        System.out.println(+a+"^"+b+"="+total);
    }
}
