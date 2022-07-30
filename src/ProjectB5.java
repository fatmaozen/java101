import java.util.Scanner;
//Armstrong sayı
public class ProjectB5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int digit=0,digitValue, total = 0,num;
        int baspow;

        System.out.println("Enter the number:");
        num=input.nextInt();
        int temp=num;

        while (temp!=0){
            temp/=10;
            digit ++;
        }
        temp=num;
        while (temp!=0){
            digitValue=temp%10;
            baspow=1;
            for (int i=1;i<=digit;i++)
                baspow*=digitValue;
            total+=baspow;
            temp/=10;
        }
        if (num==total)
            System.out.println(num+" sayısı bir Armstrong sayıdır.");
        else
            System.out.println(num+" sayısı bir Armstrong sayı değildir.");
    }

}
