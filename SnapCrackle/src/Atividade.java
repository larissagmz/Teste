public class Atividade {
    String snapCrackle(int number) {

        String myNumbers = "";

        for (int i = 1; i <= number; i++) {
            if (i % 5 == 0 && i % 2 != 0) {

                myNumbers += "SnapCrakle";

            } else if (i % 2 == 0 && i % 5 != 0 && i != 2) {
                myNumbers += i;
            } else if (i % 2 != 0) {
                myNumbers += "Snap";
            } else if (i % 5 == 0) {

                myNumbers += "Crackle";

            }
            if (FindPrimeNumber.isPrime(i) && i != 1)
                myNumbers += "Primo";
            if (i != 0 && i != number) {
                myNumbers += ", ";
            }

        }
        return myNumbers;
    }
}