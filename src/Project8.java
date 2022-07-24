import java.util.Scanner;
public class Project8 {
    //basit hesap makinesi
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double n1,n2;
        int islem;
        System.out.println("İlk sayıyı giriniz: ");
        n1= input.nextDouble();
        System.out.println("İkinci sayıyı giriniz: ");
        n2= input.nextDouble();
        System.out.println("Yapmak istediğiniz işlemi tuşlayın. \n1-toplama\n2-çıkarma\n3-çarpma\n4-bölme");
        islem= input.nextInt();
        switch (islem){
            case 1:
                System.out.println("Sonuç: "+(n1+n2));
                break;
            case 2:
                System.out.println("Sonuç: "+(n1-n2));
                break;
            case 3:
                System.out.println("Sonuç: "+(n1*n2));
                break;
            case 4:
                if (n1==0 || n2==0){
                    System.out.println("Sıfıra bölünemez!");
                }else {
                    System.out.println("Sonuç: " + (n1 / n2));
                }
                break;
            default:
                System.out.println("Hatalı tuşlama yaptınız!");
        }
    }
}
