import java.util.Scanner;
//basamakları topla
public class ProjectB4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number,countBas=0,total=0;
        System.out.println("Sayıyı girin");
        number= input.nextInt();
        while (number!=0){
            total+= number%10;
            number/=10;
            countBas++;
        }
        System.out.println("Basamak sayıları toplamı: "+total);
    }
}
