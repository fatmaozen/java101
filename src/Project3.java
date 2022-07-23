import java.util.Scanner;
public class Project3 {
    // Üçgenin alanını hesaplayan program.

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int a,b,c;
        double u,alan;
        System.out.println("Üçgenin ilk kenar uzunluğunu girin:");
        a= input.nextInt();
        System.out.println("Üçgenin ikinci kenar uzunluğunu girin:");
        b= input.nextInt();
        System.out.println("Üçgenin üçüncü kenar uzunluğunu girin:");
        c= input.nextInt();
        u=(a+b+c)/2;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin alanı: "+alan);
        
    }

}
