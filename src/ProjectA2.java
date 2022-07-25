import java.util.Scanner;
public class ProjectA2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Etkinlik öneri sistemine hoşgeldiniz!");


        int heat;
        System.out.print("Hava sıcaklığını giriniz: ");
        heat= input.nextInt();
        if (heat>-15 && heat<=5){
            System.out.println("Kayağa gidebilirsin");
        }else if(heat>5 && heat<=15){
            System.out.println("sinemaya gidebilirsin");
        }else if(heat>=15 && heat<=25){
            System.out.println("pikniğe gidebilirsin");
        }else if(heat>=25 && heat<=35){
            System.out.println("yüzmeye gidebilirsin");
        }else{
            System.out.println("Dışarı çıkmak için iyi bir gün değil, evde vakit geçirebilirsin.");
        }
    }
}
