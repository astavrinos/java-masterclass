public class MegaBytesConverter {

    public static final int ONE_MEGABYTE_TO_KILOBYTE = 1024;

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + Math.round(kiloBytes / ONE_MEGABYTE_TO_KILOBYTE) + " MB and " + kiloBytes % ONE_MEGABYTE_TO_KILOBYTE + " KB");
        }
    }

}
