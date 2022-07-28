import java.util.Scanner;
public class ProjectA9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int total=0,number;
        do {
            System.out.println("Sayıyı girin: ");
            number= input.nextInt();
            if (number%2==0){
                total+=number;
            }
        }while (number%2==0);
        System.out.println("Çiftlerin toplamı:"+total);

    }
}
