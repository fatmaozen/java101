import java.util.Scanner;

public class Project6 {
    //Vücut Kitle İndeksi Hesaplama - formül=Kilo (kg) / Boy(m) * Boy(m)
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double kilo,boy,vki;
        System.out.println("Kilonuzu yazınız:");
        kilo= input.nextDouble();
        System.out.println("Boyunuzu m cinsinden yazınız:");
        boy=input.nextDouble();
        vki=kilo/Math.pow(boy,2);
        System.out.println("Vücut kitle indeksiniz: "+vki);
    }

}
