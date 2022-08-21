import java.util.Arrays;

public class Frekans {
    public static void main(String[] args) {
        int[] dizi = {10, 5, 7, 8, 45, 9, 10, 45, 78, 32, 32};
        Arrays.sort(dizi);
        System.out.println("Tekrar eden çift sayılar: ");
        for (int i = 0; i < dizi.length; i++) {
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[i] == dizi[j]) {
                    if (dizi[j] % 2 == 0) {
                        System.out.println(dizi[j]);
                    }
                }
            }
        }
    }
}
