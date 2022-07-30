import java.util.Scanner;
//ATM
public class ProjectB8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance=1000,toplam=0,right=3;
        System.out.print("Kullanıcı adı giriniz: ");
        String username=input.nextLine();
        System.out.print("Şifre giriniz: ");
        String k=input.nextLine();
        if(username.equals("fatma") && k.equals("1453")) {
            System.out.print("Türkiye bankasına hoşgeldiniz.\nYapmak istediğiniz işlem seçiniz\n");
            System.out.println("Para yatırma için 1\nPara çekmek için 2\nBakiye sorgulama için 3\nÇıkış için 4 basınız.");
            int a =input.nextInt();
            switch (a){
                case 1:
                    System.out.println("Para miktarı: ");
                    int add=input.nextInt();
                    balance+=add;
                    System.out.print("Bakiyeniz "+balance);break;
                case 2:
                    System.out.println("Çekme istediğiniz tutar: ");
                    int pull=input.nextInt();
                    if(pull>balance){
                        System.out.println("Yetersiz bakiye");
                        break;}
                    else {
                        balance -= pull;
                        System.out.println("Bakiyeniz: " + balance);
                    }break;

                case 3:
                    System.out.println("Mevcut Bakiyeniz: "+balance);
                    break;
                case 4:
                    System.out.println("İyi günler. Yine bekleriz...");
                    break;
            }
        }
        else {
            right--;
            System.out.println("Hatalı kullanıcı veya şifre girdiniz tekrar deneyiniz.");
            if(right==0)
                System.out.println("Hesabınız bloke oldu. Bankayla iletişime geçiniz.");
            else {
                System.out.println("Kalan Hakkınız : " + right);
            }
        }
    }
}
