import java.util.Scanner;
import java.util.Arrays;
public class MaxMin {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        System.out.println(Arrays.toString(list));
        System.out.println("Sayı giriniz: ");
        int n= input.nextInt();
        Arrays.sort(list);
        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < n) {
                min = i;
            }
            if (i > n) {
                max = i;
                break;
            }
        }

        System.out.println("En yakın minimum değer " + min);
        System.out.println("En yakın maximum değer " + max);

    }
}
