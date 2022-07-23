import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner input=new Scanner(System.in);
        System.out.println("Matematik notunuzu girin: ");
        mat= input.nextInt();
        System.out.println("Fizik notunuzu girin: ");
        fizik= input.nextInt();
        System.out.println("Kimya notunuzu girin: ");
        kimya= input.nextInt();
        System.out.println("Türkçe notunuzu girin: ");
        turkce= input.nextInt();
        System.out.println("Tarih notunuzu girin: ");
        tarih= input.nextInt();
        System.out.println("Müzik notunuzu girin: ");
        muzik= input.nextInt();

        double toplam=mat+fizik+kimya+turkce+tarih+muzik;
        double sonuc= toplam/6;
        System.out.println(sonuc>=60?"Tebrikler sınıfı geçtiniz!":"Sınıfı geçemediniz.");
        System.out.println("Ortalamanız: "+ Math.round(sonuc*100)/100D);

    }
}
