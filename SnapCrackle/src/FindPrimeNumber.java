public class FindPrimeNumber {

    static public boolean isPrime(int number) {

        for (int i = 2; i < number; i++) {
            if (number % i == 0 && number != 1) {
              return  false;

            }
        }


        return true;
    }

}

