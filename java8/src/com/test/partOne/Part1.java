package com.test.partOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Garma on 11/09/2016.
 */
public class Part1 {

    private List<String> list = new ArrayList<>();

    public Part1() {
        list.add("Test");
        list.add("Game of Thrones");
        list.add("Jon");
        list.add("Snow");
        list.add("Stark");
    }

    public void sortByLenght() {
        list.sort(
                (s1, s2) -> s1.length() - s2.length()
        );
        System.out.println("Lenght: " + Arrays.asList(list));
    }

    public void reverseLenght() {
        list.sort(
                (s1, s2) -> s2.length() - s1.length()
        );
        System.out.println("Reverse lenght: " + Arrays.asList(list));
    }

    public void alpFirstCharacter() {
        list.sort(
                (s1, s2) -> s1.charAt(0) - s2.charAt(0)
        );
        System.out.println("Alp first character: " + Arrays.asList(list));
    }

    public void containsCharacter (char c) {
        list.sort(
                (s1, s2) -> {
                    int index = 0;
                    if (s1.contains(Character.toString(c)) &&
                            s2.contains(Character.toString(c))) index = 0;
                    else if (s1.contains(Character.toString(c)) &&
                        !s2.contains(Character.toString(c))) index = -1;
                    else index = 1;
                    return index;
                }
        );
        System.out.println("Contains character: " + Arrays.asList(list));
    }


}
