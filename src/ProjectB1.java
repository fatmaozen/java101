import java.util.Scanner;
//multiples of 4 and 5
public class ProjectB1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        System.out.println("Number: ");
        n= input.nextInt();
        System.out.println("Multiples of 4:");
        for (int i=1;i<=n;i*=4){
            System.out.print(i+" ");
        }
        System.out.println("\nMultiples of 5:");
        for (int i=1;i<=n;i*=5){
            System.out.print(i+" ");
        }
    }
}
