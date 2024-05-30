public class Multiples {
    public static void main(String[] args) {
        int i = 1000;
        int multiple_count = 0;
        for (int o = 1; o < i; o++) {

            boolean divisibleBy3 = o % 3 == 0;
            boolean divisibleBy5 = o % 5 == 0;

            if (divisibleBy3 || divisibleBy5) {
                multiple_count += 1;
            }
        }
        System.out.println(multiple_count);
    }
}
