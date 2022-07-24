import java.util.Scanner;
public class Project5 {
    //Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.Formül : (𝜋 * (r*r) * 𝛼) / 360
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int r;
        double pi=3.14,a,alan;
        System.out.println("Alanını bulmak istediğiniz dairenin yarıçapını giriniz: ");
        r= input.nextInt();
        System.out.println("Alanını bulmak istediğiniz daire diliminin açısını giriniz: ");
        a= input.nextDouble();
        alan=(pi*(r*r)*a)/360;
        System.out.println("ALAN= "+alan);
    }


}
