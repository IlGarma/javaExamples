package com.test.partThree;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by Garma on 11/09/2016.
 */
public class StringUtils {
    public static List<String> allMatches(List<String> list, Predicate<String> predicate) {

        List<String> listNew = new ArrayList<>();
        for(String element : list) {
            if (predicate.test(element)) listNew.add(element);
        }
        return listNew;
    }

    public static <T> List<T> allMatchesGeneric(List<T> list, Predicate<T> predicate) {

        List<T> newList = new ArrayList<T>();
        for (T element: list) {
            if (predicate.test(element)) newList.add(element);
        }
        return newList;
    }


    public static List<String> transformedList(List<String> oldList, Function<String, String> functionToApply) {
        List<String> newList= new ArrayList<>();
        for (String element: oldList) {
            newList.add(functionToApply.apply(element));
        }
        return newList;
    }

    public static <T,R> List<R> transformedListGenric(List<T> oldList, Function<T,R> functionToApply) {
        List<R> newList = new ArrayList<>();
        for (T element: oldList) {
            newList.add(functionToApply.apply(element));
        }
        return newList;
    }

}
