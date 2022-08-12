import java.util.Scanner;
public class ProjectC7 {

    static int sum(int a,int b){
        int result= a+b;
        System.out.print("Sonuç : "+result);
        return result;
    }
    static int minus(int a,int b){
        int result= a-b;
        System.out.print("Sonuç : "+result);
        return result;
    }
    static int times(int a, int b){
        int result= a*b;
        System.out.print("Sonuç : "+result);
        return result;
    }
    static int divided(int a,int b){
        if (b==0) {
            int result = 0;
            System.out.println("Sıfırdan farklı bir değer giriniz!");
            return result;
        }
            int result = a / b;
            System.out.print("Sonuç : " + result);

        return result;
    }
    static int power(int a, int b){
        int result=1;
        for (int i=1; i<=b;i++){
            result *=a;
        }
        System.out.println("Sonuç : "+result);
        return result;
    }
    static int remaining(int a, int b){
        int result=a%b;
        System.out.println("Sonuç : "+result);
        return result;
    }
    static void rectangle(int a,int b){
        System.out.println("Çevre : "+2*(a+b));
        System.out.println("\nAlan : "+(a*b));
    }



    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String menu="1)Toplama İşlemi\n"+"2)Çıkarma İşlemi\n"+"3)Çarpma İşlemi\n"+"4)Bölme İşlemi\n"+"5)Üs Alma İşlemi\n"
                +"6)Mod Alma İşlemi\n"+"7)Dikdörtgen Çevre/Alan Hesabı\n"+"8)Çıkış\n";
        System.out.print(menu);
        while (true){
            System.out.println("\nİşlem Seçiniz: ");
            int choice= input.nextInt();
            if (choice==8){
                System.out.println("İşlem sonlandırıldı.");
                break;

            }
            System.out.println("İlk sayıyı giriniz: ");
            int a=input.nextInt();
            System.out.println("İkinci sayıyı giriniz: ");
            int b=input.nextInt();
            switch (choice){
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    divided(a,b);
                    break;
                case 5:
                    power(a,b);
                    break;
                case 6:
                    remaining(a,b);
                    break;
                case 7:
                    rectangle(a,b);
                    break;
                default:
                    System.out.println("Geçersiz bir işlem seçtiniz. Tekrar deneyin..");



            }

        }


    }
}
