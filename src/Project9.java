import java.util.Scanner;
public class Project9 {
//basit kullanıcı giriş ekranı
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String password,username,sifirlama,newpassword;
        System.out.println("Kullanıcı adınızı girin: ");
        username= input.nextLine();
        System.out.println("Şifrenizi girin: ");
        password= input.nextLine();

        if (username.equals("developer") && password.equals("1453")){
            System.out.println("Sisteme giriş yaptınız!");
        }else{
            System.out.println("Kullanıcı adı veya şifre hatalı!");
            System.out.print("Şifrenizi değiştirmek ister misiniz? e/h");
            sifirlama=input.nextLine();
            if (sifirlama.equals("h")) {
                System.out.println("Giriş yapılamadı.Tekrar denemek için sayfayı yenile!");
            }else if(sifirlama.equals("e")){
                    System.out.println("Yeni şifrenizi girin: ");
                    newpassword=input.nextLine();
                if (newpassword.equals("1453")|| newpassword.equals(password)){
                    System.out.println("Yeni şifre eskisi ile aynı olamaz!");
                }else {
                    System.out.println("Şifreniz başarıyla yenilendi!");
                }
            }else{
                System.out.println("Hatalı tuşlama yaptınız!");
            }
        }

    }
}
