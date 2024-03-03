public class problem11 {
    public static void main(String[] args) {
        int count = 0;
        long sum = 0;
        int number = 2;

        while (count < 100) {
            if (isPrime(number)) {
                sum += number;
                count++;
            }
            number++;
        }

        System.out.println("Sum of the first 100 prime numbers: " + sum);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }

        return true;
    }
}
