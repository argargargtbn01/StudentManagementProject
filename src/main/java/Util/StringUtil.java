package Util;

import java.util.Random;

public class StringUtil {
    private static Random random;
    private static final String charset = "0123456789abcdefghijklmnopqrstuvwxyz";

    public static String generateRandomStringNumberCharacter(int length) {
        char buf[] = new char[length];
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(charset.length());
            buf[i] = charset.charAt(index);
        }
        return new String(buf);
    }

}
