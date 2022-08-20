public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double har = 0;
        for (double i:numbers) {
            har += 1/i;
        }
        double average=numbers.length/har;
        System.out.println("sonuç: "+average);
    }
}
