package org.examples.generics;

/**
 * Description: TODO.
 * Created by
 * @author garmeno
 * on 25/06/15
 */

public class TestAll {

    public static void main(String[] args) {
        Generic <Integer> integer1= new Generic<Integer>(85);

        integer1.getInfoClass();


        GenericTwo <Integer, String> integerString = new GenericTwo<Integer, String>(88, "Test");
        integerString.getInformation1();
        integerString.getInformation2();

        integerString.compare(new GenericTwo<Integer,String>(88, "Test"));
        integerString.compare(new GenericTwo<Integer,String>(88, "Tekst"));


    }
}
