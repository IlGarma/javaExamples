package com.test.partOne;

/**
 * Created by Garma on 11/09/2016.
 */
public class StringUtils {

    public static String betterString (String s1, String s2, TwoStringPredicate predicate) {
        return predicate.test(s1, s2) ? s1 : s2;
    }
}
