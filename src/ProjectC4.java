import java.util.Scanner;
//mük sayı
public class ProjectC4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Sayıyı girin: ");
        int n= input.nextInt();
        int factor=0;
        for (int i=1;i<n;i++){
            if (n%i==0){
                factor+=i;
            }
        }if (factor==n)
        System.out.println(n+" Mükemmel sayıdır.");
        else
            System.out.println(n+" Mükemmel sayı değildir.");
    }
}
