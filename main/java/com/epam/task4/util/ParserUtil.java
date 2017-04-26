package com.epam.task4.util;

/**
 * @author serge
 *         26.04.2017.
 */
public class ParserUtil {

    public static boolean isRootNode(String tagName) {
        return tagName.equals("treasures");
    }

    public static boolean isChildNode(String tagName) {
        return tagName.equals("treasure");
    }
}
