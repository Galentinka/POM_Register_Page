package Utilities;

import java.util.Date;

public class Utils {

    public static void main(String[] args) {
        emailWithDateStamp();
    }

    public static String emailWithDateStamp() {
        Date date = new Date();

        String emailWithStamp = date.toString().replace(" ", "_").replace(":", "_");

        return "galka" + emailWithStamp + "gmail.com";
    }
}
