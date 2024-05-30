public class Reduce {
    public static void main(String[] args) {
        int n = 4;
        int count = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                n = n / 2 ;
                count += 1;
            } else {
                n -= 1 ;
                count += 1;
            }
        }
        System.out.println(count);
        }
    }
