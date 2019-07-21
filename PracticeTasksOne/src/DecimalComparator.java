public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {

        int firstNumberConverted = (int) (firstNumber * 1000);
        int secondNumberConverted = (int) (secondNumber * 1000);

        if (firstNumberConverted == secondNumberConverted) {
            return true;
        }


        return false;
    }
}
