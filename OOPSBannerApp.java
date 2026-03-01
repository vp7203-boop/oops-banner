
public class OOPSBannerApp {

    // Pads a string to a fixed width with spaces on the right
    public static String pad(String s, int width) {
        return String.format("%-" + width + "s", s);
    }

    // Method for letter 'O' - fixed width: 7
    public static String[] getOPattern() {
        return new String[] {
            "  ***  ",
            " ** ** ",
            "**   **",
            "**   **",
            "**   **",
            " ** ** ",
            "  ***  "
        };
    }

    // Method for letter 'P' - fixed width: 7
    public static String[] getPPattern() {
        return new String[] {
            "****** ",
            "**  ** ",
            "**  ** ",
            "****** ",
            "**     ",
            "**     ",
            "**     "
        };
    }

    // Method for letter 'S' - fixed width: 7
    public static String[] getSPattern() {
        return new String[] {
            "***** ",
            "**     ",
            "**     ",
            " ***   ",
            "   **  ",
            "   **  ",
            "***** "
        };
    }

    public static void main(String[] args) {
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        int width = 7;

        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(
                pad(oPattern[i], width) + "  " +
                pad(oPattern[i], width) + "  " +
                pad(pPattern[i], width) + "  " +
                pad(sPattern[i], width)
            );
        }
    }
}