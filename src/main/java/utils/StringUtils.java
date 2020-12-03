package utils;

public class StringUtils {
    public static void append(StringBuilder sb, Object... objects) {
        for (Object o : objects)
            sb.append(o);
    }

    public static String newLine() {
        return System.lineSeparator();
    }
}
