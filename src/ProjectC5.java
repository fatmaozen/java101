import java.util.Scanner;
//Palindrome number
public class ProjectC5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int lastDigit,sum=0,temp;
        System.out.print("Enter the number: ");
        int num= input.nextInt();
        temp=num;
        while (temp>0){
            lastDigit=temp%10;
            sum=(sum*10)+lastDigit;
            temp/=10;
        }
        if (num==sum){
            System.out.println("Number is palindrome");
        }else{
            System.out.println("Number is not palindrome");
        }
    }

}

