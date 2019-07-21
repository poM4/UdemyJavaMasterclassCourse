public class FeetAndInches {

    public static double calcFeetInchesToCentimeters (double feet, double inches) {

        if (feet >= 0 || (inches >= 0 || inches <= 12)) {
            return (feet * 12 + inches) * 2.54;
        }
        return -1;
    }

    public static double calcFeetInchesToCentimeters (double inches) {

        if (inches >= 0) {
            double feet = (int) inches / 12;
            double remindedInches = (int) inches % 12;
            return calcFeetInchesToCentimeters(feet, remindedInches);
        }

        return -1;
    }


}
