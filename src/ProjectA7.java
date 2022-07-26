import java.util.Scanner;
//artık yıl bulma
public class ProjectA7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int yil;
        System.out.println("Yılı giriniz: ");
        yil= input.nextInt();
        boolean artik=false;
        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0){
                    artik = true;
                }else{
                    artik = false;
                }
            }else {
                artik = true;
            }
        } else{
            artik = false;
        }

        if (artik){
            System.out.println(yil + " : Artık yıl !");
        }else{
            System.out.println(yil + " : Artık yıl değil !");
        }
    }
}
