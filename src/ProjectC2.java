//1-100 arası asal sayılar
public class ProjectC2 {
    public static void main(String[] args) {
        System.out.println("*** 1-100 arası asal sayılar ***");
        for (int i = 2; i <= 100; i++) {
            int count = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0)
                    count++;
            }
            if (count==1)
                System.out.print(i+" ");
        }
    }
}
