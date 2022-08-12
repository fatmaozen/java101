import java.util.Scanner;
public class ProjectC8 {
    static int power(int a,int b){
        int result=1;
        for (int i=1;i<=b;i++){
            result*=a;
        }
        System.out.println("Sonuç : "+result);
        return result;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("# Üs Alma İşlemi #");
        while (true) {
            System.out.println("\n-----------------------");
            System.out.println("\nTaban sayıyı girin: ");
            int a = input.nextInt();
            System.out.println("Üs değerini girin: ");
            int b = input.nextInt();
            power(a,b);
        }

    }
}
