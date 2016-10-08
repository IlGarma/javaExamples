package com.test;

import com.test.partOne.Part1;
import com.test.partOne.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by Garma on 11/09/2016.
 */
public class Test {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Jon", "Snow", "Game", "of", "Thrones");


        Part1 c1 = new Part1();
        c1.alpFirstCharacter();
        c1.containsCharacter('e');
        c1.reverseLenght();
        c1.sortByLenght();

        String string1 = "Jon";
        String string2 = "Snow";

        String longer = com.test.partOne.StringUtils.betterString(string1, string2, (s1, s2) -> s1.length() > s2.length());
        System.out.println("Longer: " + longer);
        String first = com.test.partOne.StringUtils.betterString(string1, string2, (s1, s2) -> true);
        System.out.println("First: " + first);

        //Part 3
        System.out.println("################# PART 3 ###################");

        List<String> shortWords = com.test.partThree.StringUtils.allMatches(list, s -> s.length() < 4);
        System.out.println("shortWords: " + shortWords);
        List<String> wordsWithB = com.test.partThree.StringUtils.allMatches(list, s -> s.contains("b"));
        System.out.println("wordsWithB: " + wordsWithB);
        List<String> evenLengthWords = com.test.partThree.StringUtils.allMatches(list, s -> (s.length() % 2) == 0);
        System.out.println("evenLengthWords: " + evenLengthWords);
        List<Integer> listInteger = Arrays.asList(1,2,3,4,5,6,7,80000,9,10922,3);
        List<Integer> listIntegerGreaterThen100 = com.test.partThree.StringUtils.allMatchesGeneric(listInteger, s->s>100);
        System.out.println("only element greater then 100: " + listIntegerGreaterThen100);

        List<String> listWithExclamationPoint =
                com.test.partThree.StringUtils.transformedList(list, s->s.concat("!"));
        System.out.println("element with exclamation points: " + listWithExclamationPoint);
        List<String> listUppercaseElements =
                com.test.partThree.StringUtils.transformedList(list, String::toUpperCase);
        System.out.println("all strings in uppercase: " + listUppercaseElements);
        List<Integer> stringLenght =
                com.test.partThree.StringUtils.transformedListGenric(list, s-> s.length());
        System.out.println("length of the strings: " + stringLenght);

        //Part4
        System.out.println("################# PART 4 ###################");
        Predicate<String> containsLetterE = e-> e.contains("e");
        Predicate<String> isGreaterThen5 = e->e.length()>5;

        List<String> listContainsEAndGreaterThen5 = com.test.partFour.StringUtils.testAll(list, containsLetterE.and(isGreaterThen5));
        System.out.println("List containg letter E and greater than 5: " + listContainsEAndGreaterThen5);
        List<String> listContainsEOrGreaterThen5 = com.test.partFour.StringUtils.testAllGeneric(list, containsLetterE.or(containsLetterE));
        System.out.println("List containg E or greater than 5: " + listContainsEOrGreaterThen5);
        List<String> listNotContaingE = com.test.partFour.StringUtils.testAll(list, containsLetterE.negate());
        System.out.println("List not containg e: " + listNotContaingE);

        Function<String, Integer> returnSize = e->e.length();
        Function<Integer, String> returnBetterLength = e -> e + "!!";
        System.out.println("First better length with compose " + returnBetterLength.compose(returnSize).apply(list.get(0)));
        System.out.println("First better length with andThen " + returnSize.andThen(returnBetterLength).apply(list.get(0)));

        //Function return a predicate
        Function<Integer, Predicate<String>> functionOfFunction = length->(e->e.length()>length);

        System.out.println("Is the the word " + list.get(0) + " greater then 5? " + functionOfFunction.apply(5).test(list.get(0)));
        System.out.println("Is the the word " + list.get(0) + " greater then 2? " + functionOfFunction.apply(2).test(list.get(0)));
    }
}
