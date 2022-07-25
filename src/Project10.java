import java.util.Scanner;
public class Project10 {
    //sınıf geçme durumu -- ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int mat,fizik,turkce,kimya,muzik;
        double ortalama;
        System.out.println("matematik notu: ");
        mat=input.nextInt();
        System.out.println("fizik notu: ");
        fizik=input.nextInt();
        System.out.println("türkçe notu: ");
        turkce=input.nextInt();
        System.out.println("kimya notu: ");
        kimya=input.nextInt();
        System.out.println("müzik notu: ");
        muzik=input.nextInt();

        if (mat<0 || mat>100)
            mat=0;
        if (fizik<0 || fizik>100)
            fizik=0;
        if (kimya<0 || kimya>100)
            kimya=0;
        if (turkce<0 || turkce>100)
            turkce=0;
        if (muzik<0 || muzik>100)
            muzik=0;

        ortalama=(mat+muzik+fizik+kimya+turkce)/5;
        if (ortalama<55){
            System.out.println("Kaldınız!");
        }else{
            System.out.println("Geçtiniz!");
        }
        System.out.println("Ortalama: "+ortalama);



    }
}
