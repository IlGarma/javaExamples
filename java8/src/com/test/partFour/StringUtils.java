package com.test.partFour;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by Garma on 18/09/2016.
 */
public class StringUtils {
    public static List<String> testAll(List<String> elements, Predicate<String> predicate) {
        List<String> result = new ArrayList<>();
        for (String element : elements) {
            if (predicate.test(element)) result.add(element);
        }
        return result;
    }

    public static <T> List<T> testAllGeneric(List<T> elements, Predicate<T> predicate) {
        List<T> result = new ArrayList<T>();
        for(T element: elements) {
            if (predicate.test(element)) result.add(element);
        }
        return result;
    }
}
