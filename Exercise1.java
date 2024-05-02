public class Exercise1 {

public static void main(String[] args) {
        System.out.println("Testing Ulam");
        for (int i=1; i < 1000000; i++) {
            ulam(i);
        }
}

   public static void ulam(int n) {
        while (n > 1) {
            System.out.print(n + " ");
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }
        System.out.println(n); // Print the last number in the sequence, which is 1
    }

}