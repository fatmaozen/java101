import java.util.Scanner;
public class Project7 {
    /*Manav Kasa Programı
    Armut : 2,14 TL, Elma : 3,67 TL, Domates : 1,11 TL, Muz: 0,95 TL, Patlıcan : 5,00 TL*/
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double armutF=2.14,elmaF=3.67,domatesF=1.11,muzF=0.95,patlicanF=5.00,armut,elma,domates,patlican,muz,total;
        System.out.println("Kaç kg armut alındı?");
        armut=input.nextDouble();
        System.out.println("Kaç kg elma alındı?");
        elma= input.nextDouble();
        System.out.println("Kaç kg domates alındı?");
        domates= input.nextDouble();
        System.out.println("Kaç kg muz alındı?");
        muz= input.nextDouble();
        System.out.println("Kaç kg patlıcan alındı?");
        patlican= input.nextDouble();
        total=(armut*armutF)+(domates*domatesF)+(elma*elmaF)+(muz*muzF)+(patlican*patlicanF);
        System.out.println("Toplam tutar: "+total);


    }
}
