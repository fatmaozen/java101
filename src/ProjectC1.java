import java.util.Scanner;
//ters üçgen
public class ProjectC1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Üçgenin uzunluğunu giriniz: ");
        int n= input.nextInt();

        for (int i=0;i<n;i++){
            for (int k=0;k<=i-1;k++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*(n-i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
