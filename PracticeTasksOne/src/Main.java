import Cylinder.Cylinder;
import Cylinder.Circle;

public class Main {

    public static void main(String[] args) {
/*
        SpeedConverter.printConversion(-1.25);
        MegaBytesConvertor.printMegaBytesAndKiloBytes(-1024);

        boolean barking = BarkingDog.shouldWakeUp(true, 1);
        System.out.println(barking);

        boolean leapYear = LeapYear.isLeapYear(4001);
        System.out.println(leapYear);

        boolean decimalComparator = DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.1766);
        System.out.println(decimalComparator);

        boolean equalSum = EqualSumChecker.hasEqualSum(1, -1, 0);
        System.out.println(equalSum);

        boolean hasTeen = TeenNumberChecker.hasTeen(13, 14, 15);
        System.out.println(hasTeen);

        double centimeters1 = FeetAndInches.calcFeetInchesToCentimeters(1, 1);
        System.out.println(centimeters1);

        double centimeters2 = FeetAndInches.calcFeetInchesToCentimeters(13);
        System.out.println(centimeters2);

        TextSecondsAndMinutes.getDurationString(59,2);

        System.out.println(AreaCalculator.area(5));
        System.out.println(AreaCalculator.area(-4,5));

        MinutesToYearsDaysCalculator.printYearsAndDays(1500);

        EqualityPrinter.printEqual(1,1,2);


        System.out.println(PlayingCat.isCatPlaying(false, 35));
  */

        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());




    }
}
