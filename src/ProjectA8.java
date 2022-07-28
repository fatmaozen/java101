import java.util.Scanner;
public class ProjectA8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi , total=0, sayac = 0, ortalama,i;
        System.out.print("Sayı giriniz: ");
        sayi = input.nextInt();
        for (i=0;i<=sayi;i++){
            if (i%3==0 && i%4==0){
                total+=i;
                sayac++;
            }
        }
        ortalama=total/(sayac-1);
        System.out.println(ortalama);
    }
}
