import java.util.Arrays;

public class Frekans2 {
    public static void main(String[] args) {
        int[] dizi={1,27,20,11,11,27,5,5};
        int n=1;
        int a=0;
        Arrays.sort(dizi);
        for(int i=0;i< dizi.length;i++){
            if(dizi[i]!=a){
                for(int j=0;j<dizi.length;j++){

                    if ((i!=j) && (dizi[i]==dizi[j])) {
                        n++;
                        a=dizi[i];
                    }
                }
                System.out.println(dizi[i] +" sayısı " + n + " kere tekrar edildi.");
                n=1;
            }
        }
    }
}
