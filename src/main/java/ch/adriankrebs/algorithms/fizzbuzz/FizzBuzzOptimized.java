package ch.adriankrebs.algorithms.fizzbuzz;

/**
 * Created by Adrian on 7/7/2016.
 */
public class FizzBuzzOptimized {

        private static final int FIZZ_VALUE = 3;
        private static final int BUZZ_VALUE = 5;
        private static final int START_VALUE = 1;
        private static final int END_VALUE = 100;

        private enum FizzBuzzType {
            FIZZ,
            BUZZ,
            FIZZBUZZ,
            OTHER
        }

        public static void main(String[] args) {
            if (args.length == 2) {
                attemptFizzBuzzFromCli(args);
            }
            else {
                new FizzBuzzOptimized().generateFizzBuzz(START_VALUE,END_VALUE);
            }
        }

        private static void attemptFizzBuzzFromCli(String... args) {
            try {
                new FizzBuzzOptimized().generateFizzBuzz(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
            }
            catch (NumberFormatException e) {
                new FizzBuzzOptimized().generateFizzBuzz(START_VALUE,END_VALUE);
            }
        }

        private void generateFizzBuzz(int begin, int end) {
            for (int i = begin; i <= end; i++) {
                printFizzBuzz(checkFizzBuzz(i), i);
            }
        }

        private FizzBuzzType checkFizzBuzz(int i) {
            if (i % FIZZ_VALUE == 0 && i % BUZZ_VALUE == 0) {
                return FizzBuzzType.FIZZBUZZ;
            }
            if (i % FIZZ_VALUE == 0) {
                return FizzBuzzType.FIZZ;
            }
            if (i % BUZZ_VALUE == 0) {
                return FizzBuzzType.BUZZ;
            }
            return FizzBuzzType.OTHER;
        }

        private void printFizzBuzz(FizzBuzzType type, int i) {
            switch (type) {
                case FIZZ:
                    System.out.println("Fizz");
                    break;
                case BUZZ:
                    System.out.println("Buzz");
                    break;
                case FIZZBUZZ:
                    System.out.println("FizzBuzz");
                    break;
                case OTHER:
                    System.out.println(i);
                    break;
            }
        }




}
