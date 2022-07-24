import java.util.Scanner;
public class Project4 {
    //Taksimetre KM başına 2.20 TL tutmaktadır.Taksimetre açılış ücreti 10 TL'dir.
    //Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double km,tutar ;
        System.out.println("Mesafeyi km cinsinden giriniz: ");
        km= input.nextDouble();
        tutar=10+km*2.20;
        if (tutar<20) {
            tutar = 20;
        }else
            tutar=10+km*2.20;
        System.out.println("Tutar: "+tutar);
    }
}
