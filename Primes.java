public class Primes {
        public static void main(String[] args) {
            int nValues = 50;
    
            outerLoop: // Label for the outer loop
            for (int i = 2; i <= nValues; i++) {
                for (int j = 2; j * j <= i; j++) { // Check up to the square root of i
                    if (i % j == 0 && j != i) {
                        // i is divisible by j (except when j equals i), not a prime number
                        continue outerLoop; // Continue to the next i
                    }
                }
                //  i is a prime number
                System.out.println(i);
            }
        }

    
    
}
