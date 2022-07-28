import java.util.Scanner;
//kombinasyon
public class ProjectB2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,r,nfak=1,rfak=1,result,fark,ffak=0;
        System.out.println("Kobinasyon Hesaplama\nC(n,r)");
        System.out.print("n:");
        n= input.nextInt();
        System.out.print("r:");
        r= input.nextInt();
        fark=n-r;
        for (int i=1;i<=n;i++){
            nfak*=i;
        }
        for (int a=1;a<=r;a++){
            rfak*=a;
        }
        for (int b=1;b<=fark;b++){
            ffak*=b;
        }
        result=nfak/(rfak-ffak);
        System.out.println("C("+n+","+r+")="+result);
    }
}
