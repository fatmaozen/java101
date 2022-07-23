import java.util.Scanner;
public class Project2 {
    /* KDV Tutarı Hesaplayan Program
    1000'den küçük değerler için 0,18 kdv; büyük değerler için 0,08 KDV oranı uygulansın.
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double kdvsiz,kdvli,kdvOran,kdvTutar;
        boolean kdvDurum;

        System.out.println("KDV'sini öğrenmek istediğiniz tutarı giriniz: ");
        kdvsiz= input.nextDouble();

        kdvDurum=(0<kdvsiz)&&(1000>kdvsiz);
        kdvOran=kdvDurum?0.18:0.08;

        kdvTutar=kdvOran*kdvsiz;
        kdvli=kdvTutar+kdvsiz;

        System.out.println("KDV'siz fiyat: "+kdvsiz);
        System.out.println("KDV'li fiyat: "+kdvli);
        System.out.println("KDV tutarı: "+kdvTutar);
        System.out.println("KDV oranı: "+kdvOran);


    }

}
