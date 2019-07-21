public class TeenNumberChecker {

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {

        if (isTeen(firstAge) || isTeen(secondAge) || isTeen(thirdAge)) {
            return true;
        }
        return false;
    }

    public static boolean isTeen (int teenAge) {
        if (teenAge >= 13 && teenAge <=19 ) {
            return true;
        }
        return false;
    }
}
