import java.util.Scanner;
//Uçak bileti fiyat hesaplama
public class ProjectA5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mesafe, yas, bilet;
        double tutar, indTutar, indYas, indBilet, perKm = 0.1;
        System.out.println("Gidilecek mesafe (km):");
        mesafe = input.nextInt();
        if (mesafe <= 10) {
            System.out.println("Hatalı giriş yaptınız!");
        } else {
            System.out.println("Yolcunun Yaşı: ");
        }
        yas = input.nextInt();
        if (yas > 0) {
            if (yas < 1) {
                System.out.println("HATA!");
            } else if (yas >= 1 && yas < 12) {
                System.out.println("Bilet tipini seç\n1)Tek yön bilet\n2)Gidiş dönüş bilet");
                bilet = input.nextInt();
                switch (bilet) {
                    case 1:
                        tutar = mesafe * perKm;
                        indYas = tutar * 0.5;
                        indTutar = tutar - indYas;
                        System.out.println("fiyat: " + indTutar);
                        break;
                    case 2:
                        tutar = mesafe * perKm;
                        indYas = tutar * 0.5;
                        indTutar = tutar - indYas;
                        indBilet = indTutar * 0.2;
                        indTutar = (indTutar - indBilet) * 2;
                        System.out.println("fiyat: " + indTutar);
                        break;
                    default:
                        System.out.println("HATA!");
                }
            } else if (yas >= 12 && yas <= 24) {
                System.out.println("Bilet tipini seç\n1)Tek yön bilet\n2)Gidiş dönüş bilet");
                bilet = input.nextInt();
                switch (bilet) {
                    case 1:
                        tutar = mesafe * perKm;
                        indYas = tutar * 0.1;
                        indTutar = tutar - indYas;
                        System.out.println("fiyat: " + indTutar);
                        break;
                    case 2:
                        tutar = mesafe * perKm;
                        indYas = tutar * 0.1;
                        indTutar = tutar - indYas;
                        indBilet = indTutar * 0.2;
                        indTutar = (indTutar - indBilet) * 2;
                        System.out.println("fiyat: " + indTutar);
                        break;
                    default:
                        System.out.println("HATA!");
                }
            } else if (yas > 65 ) {
                System.out.println("Bilet tipini seç\n1)Tek yön bilet\n2)Gidiş dönüş bilet");
                bilet = input.nextInt();
                switch (bilet) {
                    case 1:
                        tutar = mesafe * perKm;
                        indYas = tutar * 0.3;
                        indTutar = tutar - indYas;
                        System.out.println("fiyat: " + indTutar);
                        break;
                    case 2:
                        tutar = mesafe * perKm;
                        indYas = tutar * 0.3;
                        indTutar = tutar - indYas;
                        indBilet = indTutar * 0.2;
                        indTutar = (indTutar - indBilet) * 2;
                        System.out.println("fiyat: " + indTutar);
                        break;
                    default:
                        System.out.println("HATA!");
                }
            } else if (yas > 24 && yas <= 65) {
                System.out.println("Bilet tipini seç\n1)Tek yön bilet\n2)Gidiş dönüş bilet");
                bilet = input.nextInt();
                switch (bilet) {
                    case 1:
                        tutar = mesafe * perKm;
                        System.out.println("fiyat: " + tutar);
                        break;
                    case 2:
                        tutar = mesafe * perKm;
                        indBilet = tutar * 0.2;
                        indTutar = (tutar - indBilet) * 2;
                        System.out.println("fiyat: " + indTutar);
                        break;
                    default:
                        System.out.println("HATA!");
                }
            }else {
                System.out.println("HATA!");
            }
        }
    }
}
