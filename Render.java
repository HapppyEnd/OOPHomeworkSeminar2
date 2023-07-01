public class Render {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public void showIndicator(Object object) {
        System.out.println(
                String.format(
                        "Class: %s.", object.getClass().getName()));
        if (object instanceof Health) {
            prettyPrint(
                    ((Health) object).getCurrentHealthPoint(),
                    ((Health) object).getMaxHealthPoint(),
                    false);
        }
        if (object instanceof Mana) {
            prettyPrint(
                    ((Mana) object).getCurrentManaPoint(),
                    ((Mana) object).getMaxManaPoint(),
                    true);
        }
        System.out.println("---------------");
    }

    public void prettyPrint(int current, int max, boolean mana) {
        int result = 100 * current / max;
        String pretty = "[";
        for (int i = 0; i < result / 10; i++) {
            pretty += "x";
        }
        for (int i = result / 10 + 1; i <= 10; i++) {
            pretty += ".";
        }
        pretty += "]";
        String color = ANSI_GREEN;
        if (mana) {
            color = ANSI_BLUE;
        } else {
            if (result < 67 && result >= 34) {
                color = ANSI_YELLOW;
            } else if (result < 34) {
                color = ANSI_RED;
            }
        }
        String field = (mana) ? "Mana   " : "Health ";
        System.out.print(field);
        System.out.print(color + pretty + ANSI_RESET);
        System.out.println(" " + current + "/" + max);
    }
}