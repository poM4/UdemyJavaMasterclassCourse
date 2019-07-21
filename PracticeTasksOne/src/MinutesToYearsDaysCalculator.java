public class MinutesToYearsDaysCalculator {

    public static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void printYearsAndDays (long minutes) {

        long minutesInDay = 24 * 60;
        long daysInYear = 365;

        if (minutes < 0 ) {
            System.out.println(INVALID_VALUE_MESSAGE);
        } else {

            if (minutes >= minutesInDay) {
                long days = minutes / minutesInDay;

                if (days >= daysInYear) {
                    long year = days / daysInYear;
                    long remainingDays = days % daysInYear;
                    System.out.println(minutes + " min = " + year + " y and " + remainingDays + " d");
                } else {
                    System.out.println(minutes + " min = 0 y and " + days + " d");
                }

            } else {
                System.out.println(minutes + " min = 0 y and 0 d");
            }

        }
    }
}
