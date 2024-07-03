import java.util.function.Function;

public class Bai01 {
    public static void main(String[] args) {
        Function<Integer, Integer> largestPrimeFactor = (number) -> {
            int largestFactor = 1;
            for (int i = 2; i <= number; i++) {
                while (number % i == 0) {
                    if (isPrime(i)) {
                        largestFactor = i;
                    }
                    number /= i;
                }
            }
            return largestFactor;
        };

        int number1 = 176;
        int number2 = 36;

        System.out.println("Number: " + number1);
        System.out.println("Thừa số nguyên tố lớn nhất: " + largestPrimeFactor.apply(number1));

        System.out.println("Number: " + number2);
        System.out.println("Thừa số nguyên tố lớn nhất " + largestPrimeFactor.apply(number2));
    }

    // Helper method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
