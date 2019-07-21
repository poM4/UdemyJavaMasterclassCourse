public class SpeedConverter {


    public static long toMilesPerHour (double kilometersPerHour) {

        long milesPerHour = Math.round(kilometersPerHour/1.609);

        if (kilometersPerHour < 0) {
            return -1;
        }

        return milesPerHour;
    }

    public static void printConversion (double kilometersPerHour) {

        long kilometersToMilesResult = toMilesPerHour(kilometersPerHour);

        if (kilometersToMilesResult == -1) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + kilometersToMilesResult + " mi/h");
        }

    }

}
