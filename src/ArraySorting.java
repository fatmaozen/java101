import java.util.Arrays;
import  java.util.Scanner;
public class ArraySorting {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Kaç eleman gireceksiniz? ");
        int n= input.nextInt();
        int[] list=new int[n];
        for (int i=0;i<n;i++){
            System.out.println(i+1+". değeri giriniz: ");
            list[i] = input.nextInt();
        }
        System.out.println("Sırasız: "+Arrays.toString(list));
        Arrays.sort(list);
        System.out.println("Sıralı: "+Arrays.toString(list));

    }
}
