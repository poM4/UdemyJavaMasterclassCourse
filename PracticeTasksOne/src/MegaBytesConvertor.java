public class MegaBytesConvertor {

    public static void printMegaBytesAndKiloBytes (int kiloBytes) {

        int megaBytesResult = kiloBytes / 1024;
        int kiloBytesResult = kiloBytes % 1024;

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + megaBytesResult + " MB and " + kiloBytesResult + " KB");
        }

    }
}
